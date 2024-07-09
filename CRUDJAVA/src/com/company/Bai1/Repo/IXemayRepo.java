package com.company.Bai1.Repo;

import com.company.Bai1.Model.XeMay;

import java.util.List;

public interface IXemayRepo {
    List<XeMay> getXeMay();
    boolean deleteXeMay();
    void addXeMay();
    void UpdateXeMay();
}
