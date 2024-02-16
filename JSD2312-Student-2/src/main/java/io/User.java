package io;

import java.io.Serializable;
import io.InputUtil.InputField;

public class User implements Serializable {
    @InputField(title = "用户名",notNull = true)
    private String userName;
    @InputField(title = "密码",notNull = true)
    private String userPassword;
    @InputField(title = "年龄",notNull = true)
    private int age;
    @InputField(title = "性别",notNull = true)
    private  char gender;
    public User(){}

    public User(String userName, String userPassword, int age, char gender) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.age = age;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
