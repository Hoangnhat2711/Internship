package Model;

import java.util.Date;

public class XeMay extends PhuongTien{
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private Date ngaySanXuat;
    private String chuSoHuu;
    private int congSuat;

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }
    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }


    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }


    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSanXuat='" + tenHangSanXuat + '\'' +
//                ", ngaySanXuat=" + ngaySanXuat +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", congSuat=" + congSuat +
                '}';
    }
}
