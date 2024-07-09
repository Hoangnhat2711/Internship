package com.company.Bai1.Model;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }


}