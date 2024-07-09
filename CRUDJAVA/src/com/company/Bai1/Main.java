package com.company.Bai1;



import com.company.Bai1.Service.PhuongTienService;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    PhuongTienService.themMoiPhuongTien();
                    break;
                case 2:
                    PhuongTienService.hienThiPhuongTien();
                    break;
                case 3:
                    PhuongTienService.xoaPhuongTien();
                    break;
                case 4:
                    PhuongTienService.timKiemPhuongTien();
                    break;
                case 5:
                    running = false;
                    break;
                default:

            }
        }
    }
}

