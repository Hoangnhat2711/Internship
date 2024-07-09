package com.company;

import java.util.Scanner;

public class File_CRUD1 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Cập nhập thông tin");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. ĐỌc dự liệu từ file txt:"); // gán vào students
        System.out.println("Thoát khỏi vòng lặp");
        Boolean a = true;
        while (a) {
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    String StudentName = inputStringScanner("Nhập tên", scanner);
                    String ClassName = inputStringScanner("Nhập tên lớp:", scanner);
                    Integer Age = inputIntScanner("Nhập tuổi", scanner);
                    Student student = new Student(StudentName, ClassName, Age);
                    studentManagement.addStudent(student);
                    studentManagement.displayListStudents();
                    break;

                case 2:
                    String id = inputStringScanner("Nhập id sinh viên cần cập nhập: ", scanner);
                    studentManagement.displayStudentByID(id);
                    String StudentNameUD = inputStringScanner("Nhập tên cần sửa", scanner);
                    String ClassNameUD = inputStringScanner("Nhập tên lớp cần sửa:", scanner);
                    Integer AgeUD = inputIntScanner("Nhập tuổi cần sửa", scanner);
                    studentManagement.updateStudent(id, StudentNameUD, ClassNameUD, AgeUD);
                    studentManagement.displayListStudents();
                    break;
                case 3:
                    String id_xoa = inputStringScanner("Nhập id sinh viên cần cập xóa: ", scanner);
                    studentManagement.displayStudentByID(id_xoa);
                    studentManagement.deleteStudent(id_xoa);
                    break;
                case 4:
                    studentManagement.ReaderFile();
                    studentManagement.displayListStudents();
                    break;
                default:
                    a = false;
            }

        }
    }

    private static Integer inputIntScanner(String data, Scanner scanner) {
        System.out.println(data);
        Integer So_nguyen = scanner.nextInt();
        return So_nguyen;
    }

    private static String inputStringScanner(String data, Scanner scanner) {
        System.out.println(data);
        String str = scanner.nextLine();
        str = scanner.nextLine();
        return str;
    }


}
