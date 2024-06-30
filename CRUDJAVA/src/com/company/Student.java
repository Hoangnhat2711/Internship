package com.company;

public class Student {
    private static int autoId = 1;
    private String id;
    private String name;
    private String className;
    private int age;

    public Student(String name, String className, int age) {
        String strID = autoId + "";
        this.id = String.format("USER%04d",autoId);
//        if (strID.length() == 1) {
//            this.id = "USER00" + autoId;
//        } else if (strID.length() == 2) {
//            this.id = "USER0" + strID;
//        } else if (strID.length() == 3) {
//            this.id = "USER" + strID;
//        }
        this.name = name;
        this.className = className;
        this.age = age;
        autoId++;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                '}';
    }
}

