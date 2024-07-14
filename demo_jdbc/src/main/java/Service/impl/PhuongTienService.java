package Service.impl;

import Model.Oto;
import Model.PhuongTien;
import Model.XeMay;
import Model.XeTai;
import Repo.impl.OtoRepo;
import Repo.impl.XeMayRepo;
import Repo.impl.XeTaiRepo;
import Service.IPhuongTienService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienService implements IPhuongTienService {
    private OtoRepo otoRepo;
    private XeMayRepo xeMayRepo;
    private XeTaiRepo xeTaiRepo;

    public PhuongTienService() {
        otoRepo = new OtoRepo();
        xeMayRepo = new XeMayRepo();
        xeTaiRepo = new XeTaiRepo();
    }

    @Override
    public boolean themMoiPhuongTien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại phương tiện để thêm mới:");
        System.out.println("1. Ô tô");
        System.out.println("2. Xe máy");
        System.out.println("3. Xe tải");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        String tenHangSanXuat = scanner.nextLine();
        System.out.print("Nhập ngày sản xuất (yyyy-MM-dd): ");
        String ngaySanXuat = scanner.nextLine();


        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();
        if(checkValid(bienKiemSoat)){
            System.out.println("Đã tồn tại biển số xe.");
            return false;
        }
        switch (choice) {
            case 1:
                System.out.print("Nhập số chỗ ngồi: ");
                int soChoNgoi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập kiểu xe: ");
                String kieuXe = scanner.nextLine();
                Oto oto = new Oto();
                oto.setBienKiemSoat(bienKiemSoat);
                oto.setTenHangSanXuat(tenHangSanXuat);
                oto.setChuSoHuu(chuSoHuu);
                oto.setSoChoNgoi(soChoNgoi);
                oto.setKieuXe(kieuXe);
                oto.setNgaySanXuat(Date.valueOf(ngaySanXuat));
                return otoRepo.themMoiOto(oto);
            case 2:
                System.out.print("Nhập công suất: ");
                int congSuat = scanner.nextInt();
                scanner.nextLine();
                XeMay xeMay = new XeMay();
                xeMay.setBienKiemSoat(bienKiemSoat);
                xeMay.setTenHangSanXuat(tenHangSanXuat);
                xeMay.setChuSoHuu(chuSoHuu);
                xeMay.setCongSuat(congSuat);
                return xeMayRepo.themMoiXeMay(xeMay);
            case 3:
                System.out.print("Nhập trọng tải: ");
                int trongTai = scanner.nextInt();
                scanner.nextLine();
                XeTai xeTai = new XeTai();
                xeTai.setBienKiemSoat(bienKiemSoat);
                xeTai.setTenHangSanXuat(tenHangSanXuat);
                xeTai.setChuSoHuu(chuSoHuu);
                xeTai.setTrongTai(trongTai);
                return xeTaiRepo.themMoiXeTai(xeTai);
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return false;
        }
    }

    private boolean checkValid(String bienKiemSoat) {
//        System.out.println("Bắt đầu check valid.");
        if(timKiemPhuongTien(bienKiemSoat)!= null) {
//            System.out.println("Kết thúc check valid.");
            return true;
        }
        else{
            System.out.println("Kết thúc check valid.");
            return false;
        }
    }

    @Override
    public List<PhuongTien> hienThiPhuongTien(int choice) {
        List<PhuongTien> phuongTiens = new ArrayList<>();
        switch (choice) {
            case 1:
                List<Oto> otos = otoRepo.hienThiOto();
                phuongTiens.addAll(otos);
                break;
            case 2:
                List<XeMay> xeMays = xeMayRepo.hienThiXeMay();
                phuongTiens.addAll(xeMays);
                break;
            case 3:
                List<XeTai> xeTais = xeTaiRepo.hienThiXeTai();
                phuongTiens.addAll(xeTais);
                break;
            default:
                return null;
        }
        return phuongTiens;
    }



    @Override

    public boolean xoaPhuongTien(String bienKiemSoat) {
        List<Oto> otos = otoRepo.hienThiOto();
        for (Oto oto : otos) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                otoRepo.xoaOto(bienKiemSoat);
                return true;
            }
        }


        List<XeMay> xeMays = xeMayRepo.hienThiXeMay();
        for (XeMay xeMay : xeMays) {
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                xeMayRepo.xoaXeMay(bienKiemSoat);
                return true;
            }
        }
        List<XeTai> xeTais = xeTaiRepo.hienThiXeTai();
        for (XeTai xeTai : xeTais) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                xeTaiRepo.xoaXeTai(bienKiemSoat);
                return true;
            }
        }

        return false;
    }

//    @Override
//    public PhuongTien timKiemPhuongTien(String bienKiemSoat) {
//        List<PhuongTien> phuongTiens = new ArrayList<PhuongTien>();
//
//        List<Oto> otos = otoRepo.hienThiOto();
//        phuongTiens.addAll(otos);
//
//        List<XeMay> xeMays = xeMayRepo.hienThiXeMay();
//        phuongTiens.addAll(xeMays);
//
//        List<XeTai> xeTais = xeTaiRepo.hienThiXeTai();
//        phuongTiens.addAll(xeTais);
//        for (PhuongTien phuongTien : phuongTiens) {
//            if (phuongTien.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
//                return phuongTien;
//            }
//        }
//
//        return null;
//
//
//
//
//    }
public PhuongTien timKiemPhuongTien(String bienKiemSoat) {
    List<Oto> otos = otoRepo.timKiemOto(bienKiemSoat);
    if (otos != null && !otos.isEmpty()) {
        return otos.get(0);
    }

    List<XeMay> xeMays = xeMayRepo.timKiemXeMay(bienKiemSoat);
    if (xeMays != null && !xeMays.isEmpty()) {
        return xeMays.get(0);
    }

    List<XeTai> xeTais = xeTaiRepo.timKiemXeTai(bienKiemSoat);
    if (xeTais != null && !xeTais.isEmpty()) {
        return xeTais.get(0);
    }

    return null;
}
}
