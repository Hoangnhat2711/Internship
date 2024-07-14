package Service;


import Model.Oto;
import Model.PhuongTien;
import Model.XeMay;
import Model.XeTai;

import java.util.List;

public interface IPhuongTienService {
    boolean themMoiPhuongTien();
    List<PhuongTien> hienThiPhuongTien(int choice);
    boolean xoaPhuongTien(String bienKiemSoat);
    PhuongTien timKiemPhuongTien(String bienKiemSoat);


}
