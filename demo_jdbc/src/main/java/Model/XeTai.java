package Model;

import java.util.Date;

public class XeTai extends PhuongTien {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private Date ngaySanXuat;
    private String chuSoHuu;
    private int trongTai;

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
//                ", ngaySanXuat=" + ngaySanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", trongTai=" + trongTai +
                '}';
    }
}
