package Repo.impl;

import Model.XeMay;
import Repo.IXeMayRepo;
import Utils.ConnectionDbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class XeMayRepo implements IXeMayRepo {

    @Override
    public boolean themMoiXeMay(XeMay xeMay) {
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO XeMay (bienKiemSoat, tenHangSanXuat, chuSoHuu, congSuat) VALUES (?, ?, ?, ?)");
            statement.setString(1, xeMay.getBienKiemSoat());
            statement.setString(2, xeMay.getTenHangSanXuat());
            statement.setString(3, xeMay.getChuSoHuu());
            statement.setInt(4, xeMay.getCongSuat());
            statement.executeUpdate();
            statement.close();
            connection.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<XeMay> hienThiXeMay() {
        List<XeMay> xeMays = new ArrayList<>();
        String sql = "SELECT * FROM XeMay";
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                XeMay xeMay = new XeMay();
                xeMay.setBienKiemSoat(rs.getString("bienKiemSoat"));
                xeMay.setTenHangSanXuat(rs.getString("tenHangSanXuat"));
                xeMay.setNgaySanXuat(rs.getDate("ngaySanXuat"));
                xeMay.setChuSoHuu(rs.getString("chuSoHuu"));
                xeMay.setCongSuat(rs.getInt("congSuat"));
                xeMays.add(xeMay);
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return xeMays;
    }

    @Override
    public boolean xoaXeMay(String bienKiemSoat) {
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM XeMay WHERE bienKiemSoat = ?");
            statement.setString(1, bienKiemSoat);
            statement.execute();
            statement.close();
            connection.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<XeMay> timKiemXeMay(String bienKiemSoat) {
        List<XeMay> xeMays = new ArrayList<>();
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM XeMay WHERE bienKiemSoat LIKE ?");
            statement.setString(1, "%" + bienKiemSoat + "%");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                XeMay xeMay = new XeMay();
                xeMay.setBienKiemSoat(rs.getString("bienKiemSoat"));
                xeMay.setTenHangSanXuat(rs.getString("tenHangSanXuat"));
                xeMay.setNgaySanXuat(rs.getDate("ngaySanXuat"));
                xeMay.setChuSoHuu(rs.getString("chuSoHuu"));
                xeMay.setCongSuat(rs.getInt("congSuat"));
                xeMays.add(xeMay);
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return xeMays;
    }
}
