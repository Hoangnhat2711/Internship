package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có id: " + id);
    }

    public void updateStudent(String id, String newName, String newClassName, int newAge) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setClassName(newClassName);
                student.setAge(newAge);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có id: " + id);
    }

    public void displayListStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void filterListStudentsByName(String substring) {
        for (Student student : students) {
            if (student.getName().contains(substring)) {
                System.out.println(student);
            }
        }
    }

    public void filterListStudentsByAge(int age) {
        for (Student student : students) {
            if (student.getAge() == age) {
                System.out.println(student);
            }
        }
    }


    public void displayStudentByName(String name) {
        for (Student student : students) {
            if (student.getName()==name) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có tên: " + name);
    }

    public void displayStudentByID(String id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có id: " + id);
    }
//    public void displayMaxId(){
//        int Max = 0;
//        for (Student student : students){
//            if (student.getId()>Max){
//                Max = student.getId();
//            }
//        }
//        for (Student student : students){
//            if (student.getId()==Max){
//                System.out.println(student);
//            }
//        }
//        }
//}

