package com.company.Bai1.Repo.Impl;

import com.company.Bai1.Model.Oto;
import com.company.Bai1.Repo.IOtoRepo;

import java.util.ArrayList;
import java.util.List;

// lay du lieu tu db hoac file .csv hoac vung nho memory
public class OtoRepo implements IOtoRepo {
    private static List<Oto> otoList = new ArrayList<>();

    @Override
    public List<Oto> getOto() {
        return otoList;
    }

    @Override
    public boolean deleteOto(String id) {
        for (Oto oto: otoList) {
            if (oto.getBienKiemSoat().equals(id)){
                otoList.remove(oto);
                return true;
            }
        }
        return false;
    }

    @Override
    public void addOto(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public boolean updateOto(Oto updateOto) {
        for (Oto oto: otoList) {
            if (oto.getBienKiemSoat().equals(updateOto.getBienKiemSoat())){
                oto.setKieuXe(updateOto.getKieuXe());
                oto.setSoChoNgoi(updateOto.getSoChoNgoi());
                // lam tiep;
                return true;
            }
        }
        return false;
    }
}
