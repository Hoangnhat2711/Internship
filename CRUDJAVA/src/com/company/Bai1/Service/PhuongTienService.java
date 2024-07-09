package com.company.Bai1.Service;


import com.company.Bai1.Model.Oto;
import com.company.Bai1.Model.PhuongTien;
import com.company.Bai1.Model.XeMay;
import com.company.Bai1.Model.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class PhuongTienService {
    private static ArrayList<Oto> otoList = new ArrayList<>();
    private static ArrayList<XeTai> xeTaiList = new ArrayList<>();
    private static ArrayList<XeMay> xeMayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void themMoiPhuongTien() {
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm xe máy");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Nhập trọng tải:");
                int trongTai = scanner.nextInt();
                XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                xeTaiList.add(xeTai);
                break;
            case 2:
                System.out.println("Nhập số chỗ ngồi:");
                int soChoNgoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập kiểu xe:");
                String kieuXe = scanner.nextLine();
                Oto oto = new Oto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                otoList.add(oto);
                break;
            case 3:
                System.out.println("Nhập công suất:");
                int congSuat = scanner.nextInt();
                XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                xeMayList.add(xeMay);
                break;
            default:
        }
    }

    public static void hienThiPhuongTien() {
        System.out.println("1. Hiện thị xe tải");
        System.out.println("2. Hiện thị ôtô");
        System.out.println("3. Hiện thị xe máy");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                for (XeTai xeTai : xeTaiList) {
                    System.out.println(xeTai);
                }
                break;
            case 2:
                for (Oto oto : otoList) {
                    System.out.println(oto);
                }
                break;
            case 3:
                for (XeMay xeMay : xeMayList) {
                    System.out.println(xeMay);
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public static void xoaPhuongTien() {
//        System.out.println("Nhập biển kiểm soát:");
//        String bienKiemSoat = scanner.nextLine();
//        Boolean a = true;
//        Integer x=0;
//while (a){
//        x=x+1;
//        PhuongTien phuongTien = null;
//        int index = -1;
//
//        for (int i = 0; i < xeTaiList.size(); i++) {
//            if (xeTaiList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
//                phuongTien = xeTaiList.get(i);
//                index = i;
//                  PhuongTien phuongTien = timKiemPhuongTienTheoBienKiemSoat(xeTaiList.get(i).getBienKiemSoat();
//                  xeTaiList.remove(phuongTien);
//                break;
//            }
//        }
//        if (phuongTien == null) {
//            for (int i = 0; i < otoList.size(); i++) {
//                if (otoList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
//                    phuongTien = otoList.get(i);
//                    index = i;
//                    break;
//                }
//            }
//        }
//        if (x==1){
//            a=false;
//        }
//}
//        System.out.println("Nhập biển kiểm soát:");
//        String bienKiemSoat = scanner.nextLine();
//
//        PhuongTien phuongTien = timKiemPhuongTienTheoBienKiemSoat(bienKiemSoat);
//        if (phuongTien != null) {
//            System.out.println("(Yes/No)");
//            String confirm = scanner.nextLine();
//            if (confirm.equalsIgnoreCase("Yes")) {
//                if (phuongTien instanceof XeTai) {
//                    xeTaiList.remove(phuongTien);
//                } else if (phuongTien instanceof Oto) {
//                    otoList.remove(phuongTien);
//                } else if (phuongTien instanceof XeMay) {
//                    xeMayList.remove(phuongTien);
//                }
//                System.out.println("Đã xóa thành công.");
//            }
//        } else {
//            System.out.println("Không tìm thấy phương tiện.");
//        }
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        for (XeTai xetai : xeTaiList){
            if(xetai.getBienKiemSoat().equals(bienKiemSoat)){
                xeTaiList.remove(xetai);
                break;
            }
        }
        for (Oto oto : otoList){
            if(oto.getBienKiemSoat().equals(bienKiemSoat)){
                otoList.remove(oto);
                break;
            }
        }
        for (XeMay xemay : xeMayList){
            if(xemay.getBienKiemSoat().equals(bienKiemSoat)){
                xeMayList.remove(xemay);
                break;
            }
        }
    }

    public static void timKiemPhuongTien() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();

        PhuongTien phuongTien = timKiemPhuongTienTheoBienKiemSoat(bienKiemSoat);
        if (phuongTien != null) {
            System.out.println(phuongTien);
        } else {
            System.out.println("Không tìm thấy phương tiện nào được tìm thấy.");
        }
    }

    private static PhuongTien timKiemPhuongTienTheoBienKiemSoat(String bienKiemSoat) {
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().contains(bienKiemSoat)) {
                return xeTai;
            }
        }
        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat().contains(bienKiemSoat)) {
                return oto;
            }
        }
        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienKiemSoat().contains(bienKiemSoat)) {
                return xeMay;
            }
        }
        return null;
    }
}

