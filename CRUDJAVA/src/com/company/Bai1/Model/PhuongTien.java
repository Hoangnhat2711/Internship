package com.company.Bai1.Model;


//abstract class PhuongTien {
//    private String bienKiemSoat;
//    private String hangSanXuat;
//    private int namSanXuat;
//    private String chuSoHuu;
//
//    public PhuongTien(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
//        this.bienKiemSoat = bienKiemSoat;
//        this.hangSanXuat = hangSanXuat;
//        this.namSanXuat = namSanXuat;
//        this.chuSoHuu = chuSoHuu;
//    }
//
//    public String getBienKiemSoat() {
//        return bienKiemSoat;
//    }
//
//    public String getHangSanXuat() {
//        return hangSanXuat;
//    }
//
//    public int getNamSanXuat() {
//        return namSanXuat;
//    }
//
//    public String getChuSoHuu() {
//        return chuSoHuu;
//    }
//
//    @Override
//    public String toString() {
//        return "PhuongTien{" +
//                "bienKiemSoat='" + bienKiemSoat + '\'' +
//                ", hangSanXuat='" + hangSanXuat + '\'' +
//                ", namSanXuat=" + namSanXuat +
//                ", chuSoHuu='" + chuSoHuu + '\'' +
//                '}';
//    }
//}


public abstract class PhuongTien{
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public String toString() {
        return "PhuongTien{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}





