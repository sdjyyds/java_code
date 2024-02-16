package io.test;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -5108023554624630982L;
    private String stuId;
    private transient String name;
    private String tele;
    public Student(){}

    public Student(String stuId, String name, String tele) {
        this.stuId = stuId;
        this.name = name;
        this.tele = tele;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", name='" + name + '\'' +
                ", tele='" + tele + '\'' +
                '}';
    }
}
