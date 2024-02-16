package io;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class InputUtil {
    public static final String DEFAULT_MODE = "DEFAULT";
    private static Scanner scanner = new Scanner(System.in);
    //类型默认正则表达式
    private static Map<Class,String> regexMapping = new HashMap<>();
    //类型不匹配正则表达式的默认提示信息
    private static Map<Class,String> notMatchTitleMapping = new HashMap<>();
    static {
        initRegexMapping();
        initNotMatchTitleMapping();
    }
    private static void initRegexMapping(){
        regexMapping.put(String.class,".*");
        regexMapping.put(int.class,"[0-9]+");
        regexMapping.put(long.class,"[0-9]+");
        regexMapping.put(byte.class,"[0-9]+");
        regexMapping.put(short.class,"[0-9]+");
        regexMapping.put(float.class,"[0-9]+(\\.[0-9]+)?");
        regexMapping.put(double.class,"[0-9]+(\\.[0-9]+)?");
        regexMapping.put(char.class,".");
        regexMapping.put(boolean.class,"([tT][rR][uU][eE]|[fF][aA][lL][sS][eE])");
        regexMapping.put(Integer.class,"[0-9]+");
        regexMapping.put(Long.class,"[0-9]+");
        regexMapping.put(Byte.class,"[0-9]+");
        regexMapping.put(Short.class,"[0-9]+");
        regexMapping.put(Float.class,"[0-9]+(\\.[0-9]+)?");
        regexMapping.put(Double.class,"[0-9]+(\\.[0-9]+)?");
        regexMapping.put(Character.class,".");
        regexMapping.put(Boolean.class,"([tT][rR][uU][eE]|[fF][aA][lL][sS][eE])");
    }
    private static void initNotMatchTitleMapping(){
        notMatchTitleMapping.put(String.class,"");
        notMatchTitleMapping.put(int.class,"请输入整数");
        notMatchTitleMapping.put(long.class,"请输入整数");
        notMatchTitleMapping.put(byte.class,"请输入整数");
        notMatchTitleMapping.put(short.class,"请输入整数");
        notMatchTitleMapping.put(float.class,"请输入小数");
        notMatchTitleMapping.put(double.class,"请输入小数");
        notMatchTitleMapping.put(char.class,"只能输入一个字符");
        notMatchTitleMapping.put(boolean.class,"只能输入'true'或'false'");
        notMatchTitleMapping.put(Integer.class,"请输入整数");
        notMatchTitleMapping.put(Long.class,"请输入整数");
        notMatchTitleMapping.put(Byte.class,"请输入整数");
        notMatchTitleMapping.put(Short.class,"请输入整数");
        notMatchTitleMapping.put(Float.class,"请输入小数");
        notMatchTitleMapping.put(Double.class,"请输入小数");
        notMatchTitleMapping.put(Character.class,"请输入一个字符");
        notMatchTitleMapping.put(Boolean.class,"请输入'true'或'false'");
    }
    public static<T> T getInputObject(T t,String title,String mode){
        if (title!=null&&title.trim().length()>0){
            System.out.println(title);
        }
        return getInputObject_(t,mode);
    }
    public static<T> T getInputObject(T t,String title){
        return getInputObject(t,title,DEFAULT_MODE);
    }
    public static<T> T getInputObject(T t){
        return getInputObject_(t,DEFAULT_MODE);
    }
    private static<T> T getInputObject_(T t,String mode){
        Class cls = t.getClass();
        String mode_ = mode==null||mode.trim().isEmpty()?DEFAULT_MODE:mode;//传入负数统一变回默认值-1
        try {
            Field[] fields = cls.getDeclaredFields();
            for(Field field : fields){
                if(field.isAnnotationPresent(InputField.class)){
                    if(DEFAULT_MODE.equals(mode_)||Arrays.stream(field.getAnnotation(InputField.class).mode()).anyMatch(e->e.equals(mode_))) {
                        Object inValue = getInputValue(field);
                        if (inValue == null) {//返回值为null则忽略该属性
                            continue;
                        }
                        setValueToField(t, field, inValue);
                    }
                }
            }
            return t;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 为属性赋值
     * @param obj
     * @param field
     * @param value
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private static void setValueToField(Object obj,Field field,Object value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        StringBuilder fieldMethodNameBuilder = new StringBuilder(field.getName());//获取属性名
        String c = fieldMethodNameBuilder.substring(0,1).toUpperCase(Locale.ROOT);//属性首字母大写
        fieldMethodNameBuilder.replace(0,1,c).insert(0,"set");//拼接set方法名
        Method method = obj.getClass().getDeclaredMethod(fieldMethodNameBuilder.toString(),field.getType());
        method.invoke(obj,value);
    }

    /**
     * 为属性获取用户输入的值
     * @param field
     * @return
     */
    private static Object getInputValue(Field field){
        Class cls = field.getType();
        //仅支持基本类型和字符串
        if(regexMapping.get(cls)==null){
            return null;
        }
        InputField inputField = field.getAnnotation(InputField.class);
        String title = inputField.title();
        boolean notNull = inputField.notNull();
        String regex = inputField.regex();
        String regexNotMathTitle = inputField.regexNotMathTitle();
        String line;
        while(true) {
            //指定了提示信息则进行提示,否则提示输入该属性名
            System.out.println("请输入["+(title.isEmpty()?field.getName():title) + "]:");
            line = scanner.nextLine();
            if(line.trim().isEmpty()){
                if(notNull) {//如果要求不允许为空,则必须输入至少一个字符(不包含单独的空格)
                    System.out.println(title + "不能为空");
                    continue;
                }else{
                    return null;
                }
            }
            if(!line.matches(regex.isEmpty()?regexMapping.get(cls):regex)){
                /*
                    当不匹配正则表达式时输出:
                        1:指定了提示信息,输出提示信息:regexNotMathTitle
                        2:没有指定提示信息,但是指定了正则表达式,输出提示信息:格式不匹配
                        3:没有指定提示信息,也没有指定正则表达式,输出默认提示信息
                 */
                System.out.println(regexNotMathTitle.isEmpty()?regex.isEmpty()?notMatchTitleMapping.get(cls):"格式不匹配":regexNotMathTitle);
                continue;
            }else{
                break;
            }
        }
        return convertToFieldType(cls,line);
    }

    /**
     * 根据字段类型将输入值转换为对应的类型
     * @param fieldType
     * @param line
     * @return
     */
    private static Object convertToFieldType(Class<?> fieldType, String line) {
        if (fieldType == String.class) {
            return line;
        } else if (fieldType == int.class || fieldType == Integer.class) {
            return Integer.parseInt(line);
        } else if (fieldType == long.class || fieldType == Long.class) {
            return Long.parseLong(line);
        } else if (fieldType == byte.class || fieldType == Byte.class) {
            return Byte.parseByte(line);
        } else if (fieldType == short.class || fieldType == Short.class) {
            return Short.parseShort(line);
        } else if (fieldType == float.class || fieldType == Float.class) {
            return Float.parseFloat(line);
        } else if (fieldType == double.class || fieldType == Double.class) {
            return Double.parseDouble(line);
        } else if (fieldType == char.class || fieldType == Character.class) {
            return line.charAt(0);
        } else if (fieldType == boolean.class || fieldType == Boolean.class) {
            return Boolean.parseBoolean(line);
        }
        return null;
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InputField {
        String title() default "";//获取属性输入时的提示信息
        boolean notNull() default false;//是否允许为空
        String regex() default "";//正则表达式验证
        String regexNotMathTitle() default "";//正则表达式不匹配时的提示信息
        String[] mode() default "DEFAULT";//自定义模式,匹配模式的属性会提示输入
    }
}
