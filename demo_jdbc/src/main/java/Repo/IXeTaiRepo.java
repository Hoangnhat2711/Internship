package Repo;

import Model.XeTai;
import java.util.List;

public interface IXeTaiRepo {
    boolean themMoiXeTai(XeTai xeTai);
    List<XeTai> hienThiXeTai();
    boolean xoaXeTai(String bienKiemSoat);
    List<XeTai> timKiemXeTai(String bienKiemSoat);
}
