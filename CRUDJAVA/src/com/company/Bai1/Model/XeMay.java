package com.company.Bai1.Model;

public class XeMay extends PhuongTien {
    private int congSuat;

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + ", XeMay{" +
                "congSuat=" + congSuat +
                '}';
    }
}