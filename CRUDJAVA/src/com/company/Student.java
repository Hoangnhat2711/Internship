package com.company;

public class Student {
    private static int autoId=1;
    private int id;
    private String name;
    private String className;
    private int age;

    public Student(String name, String className, int age) {
        this.id = autoId;
        this.name = name;
        this.className = className;
        this.age = age;
        autoId++;
    }

    public int getId() {
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

