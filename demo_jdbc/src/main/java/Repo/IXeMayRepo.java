package Repo;

import Model.Oto;
import Model.XeMay;

import java.util.List;

public interface IXeMayRepo {
    boolean themMoiXeMay(XeMay xemay);
    List<XeMay> hienThiXeMay();
    boolean xoaXeMay(String bienKiemSoat);
    List<XeMay> timKiemXeMay(String bienKiemSoat);
}
