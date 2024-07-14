package Repo;

import Model.Oto;
import java.util.List;

public interface IOtoRepo {
    boolean themMoiOto(Oto oto);
    List<Oto> hienThiOto();
    boolean xoaOto(String bienKiemSoat);
    List<Oto> timKiemOto(String bienKiemSoat);
}
