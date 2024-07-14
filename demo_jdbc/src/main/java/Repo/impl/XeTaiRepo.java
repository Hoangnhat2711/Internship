package Repo.impl;

import Model.XeTai;
import Repo.IXeTaiRepo;
import Utils.ConnectionDbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class XeTaiRepo implements IXeTaiRepo {

    @Override
    public boolean themMoiXeTai(XeTai xeTai) {
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO XeTai (bienKiemSoat, tenHangSanXuat, chuSoHuu, trongTai) VALUES (?, ?, ?, ?)");
            statement.setString(1, xeTai.getBienKiemSoat());
            statement.setString(2, xeTai.getTenHangSanXuat());
            statement.setString(3, xeTai.getChuSoHuu());
            statement.setInt(4, xeTai.getTrongTai());
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
    public List<XeTai> hienThiXeTai() {
        List<XeTai> xeTais = new ArrayList<>();
        String sql = "SELECT * FROM XeTai";
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                XeTai xeTai = new XeTai();
                xeTai.setBienKiemSoat(rs.getString("bienKiemSoat"));
                xeTai.setTenHangSanXuat(rs.getString("tenHangSanXuat"));
//                xeTai.setNgaySanXuat(rs.getDate("ngaySanXuat"));
                xeTai.setChuSoHuu(rs.getString("chuSoHuu"));
                xeTai.setTrongTai(rs.getInt("trongTai"));
                xeTais.add(xeTai);
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return xeTais;
    }

    @Override
    public boolean xoaXeTai(String bienKiemSoat) {
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM XeTai WHERE bienKiemSoat = ?");
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
    public List<XeTai> timKiemXeTai(String bienKiemSoat) {
        List<XeTai> xeTais = new ArrayList<>();
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM XeTai WHERE bienKiemSoat LIKE ?");
            statement.setString(1, "%" + bienKiemSoat + "%");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                XeTai xeTai = new XeTai();
                xeTai.setBienKiemSoat(rs.getString("bienKiemSoat"));
                xeTai.setTenHangSanXuat(rs.getString("tenHangSanXuat"));
//                xeTai.setNgaySanXuat(rs.getDate("ngaySanXuat"));
                xeTai.setChuSoHuu(rs.getString("chuSoHuu"));
                xeTai.setTrongTai(rs.getInt("trongTai"));
                xeTais.add(xeTai);
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return xeTais;
    }
}
