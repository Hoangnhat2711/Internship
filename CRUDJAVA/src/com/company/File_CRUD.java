package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File_CRUD {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();


        try {
            FileReader fileReader = new FileReader("C:/Drivers/HocKem/CRUDJAVA/src/com/company/Hi.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitObject = line.split(",");
                Student student = new Student(splitObject[1], splitObject[2], Integer.parseInt(splitObject[3]));
                studentManagement.addStudent(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Student newStudent = new Student("Hoang Nhat", "12", 21);
        studentManagement.addStudent(newStudent);
        writeFile(studentManagement);


        studentManagement.displayListStudents();

        studentManagement.updateStudent(newStudent.getId(), "Nguyen Van B", "10A2", 17);
        writeFile(studentManagement);

        studentManagement.deleteStudent(newStudent.getId());
        writeFile(studentManagement);

        studentManagement.displayListStudents();
    }

    public static void readFile(StudentManagement studentManagement) {
        try {
            FileReader fileReader = new FileReader("C:/Drivers/HocKem/CRUDJAVA/src/com/company/Hi.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitObject = line.split(",");
                Student student = new Student(splitObject[1], splitObject[2], Integer.parseInt(splitObject[3]));
                studentManagement.addStudent(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(StudentManagement studentManagement) {
        try {
            FileWriter fileWriter = new FileWriter("C:/Drivers/HocKem/CRUDJAVA/src/com/company/Hi.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            List<Student> students = studentManagement.getList();
            for (Student student : students) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getClassName() + "," + student.getAge());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
