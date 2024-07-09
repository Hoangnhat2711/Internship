package com.company.Bai1.Repo;

import com.company.Bai1.Model.Oto;

import java.util.List;

public interface IOtoRepo {
    List<Oto> getOto();
    boolean deleteOto(String id);
    void addOto(Oto oto);
    boolean updateOto(Oto oto);
}
