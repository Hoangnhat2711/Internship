package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement manager = new StudentManagement();

        manager.addStudent(new Student(" A", "11", 20));
        manager.addStudent(new Student(" B", "12", 21));
        manager.addStudent(new Student(" C", "10", 19));

        System.out.println("Danh sách sinh viên ban đầu:");
        manager.displayListStudents();

        manager.updateStudent(1, "Trần Thị B", "K63CB", 22);

        System.out.println("\nDanh sách sinh viên sau khi cập nhật:");
        manager.displayListStudents();

        manager.deleteStudent(1);

        System.out.println("\nDanh sách sinh viên sau khi xóa:");
        manager.displayListStudents();
        while (true) {
            System.out.println("-------------------Chọn----------------");
            System.out.println("1: Thêm sinh viên");
            System.out.println("2: Cập nhập thông tin sinh viên");
            System.out.println("3: Xóa thông tin sinh viên");
            System.out.println("4: Hien thi ds sinh vien");
            System.out.print("CHon option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Nhap ten");
                    String name = scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Nhap lop");
                    String className = scanner.nextLine();
                    System.out.println("Nhap tuoi");
                    int age = scanner.nextInt();
                    manager.addStudent(new Student(name, className, age));
                    manager.displayMaxId();
                    break;
                case 2:
                    System.out.print("Nhập ID của sinh viên cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập lớp mới: ");
                    String newClassName = scanner.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int newAge = scanner.nextInt();
                    manager.updateStudent(updateId, newName, newClassName, newAge);
                    break;

                case 3:
                    System.out.print("Nhập ID của sinh viên cần xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;

                case 4:
                    System.out.println("Danh sách sinh viên:");
                    manager.displayListStudents();
                    break;

            }
        }
    }
}
