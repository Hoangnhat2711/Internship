package com.company;

public class Main {

    public static void main(String[] args) {
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

        System.out.println("Chọn");
        System.out.println("1: Thêm sinh viên");
        System.out.println("2: Cập nhập thông tin sinh viên");
        System.out.println("3: Xóa thông tin sinh viên");
    }
}
