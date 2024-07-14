package Repo.impl;

import Model.Oto;
import Repo.IOtoRepo;
import Utils.ConnectionDbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OtoRepo implements IOtoRepo {

    @Override
    public boolean themMoiOto(Oto oto) {
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Oto (bienKiemSoat, tenHangSanXuat, chuSoHuu, soChoNgoi, kieuXe, ngaySanXuat) VALUES (?, ?, ?, ?, ?, ?)");
            statement.setString(1, oto.getBienKiemSoat());
            statement.setString(2, oto.getTenHangSanXuat());
            statement.setString(3, oto.getChuSoHuu());
            statement.setInt(4, oto.getSoChoNgoi());
            statement.setString(5, oto.getKieuXe());
            statement.setDate(6, oto.getNgaySanXuat());

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
    public List<Oto> hienThiOto() {
        List<Oto> otos = new ArrayList<>();
        String sql = "SELECT * FROM Oto";
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Oto oto = new Oto();
                oto.setBienKiemSoat(rs.getString("bienKiemSoat"));
                oto.setTenHangSanXuat(rs.getString("tenHangSanXuat"));
                oto.setNgaySanXuat(rs.getDate("ngaySanXuat"));
                oto.setChuSoHuu(rs.getString("chuSoHuu"));
                oto.setSoChoNgoi(rs.getInt("soChoNgoi"));
                oto.setKieuXe(rs.getString("kieuXe"));
                otos.add(oto);
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return otos;
    }

    @Override
    public boolean xoaOto(String bienKiemSoat) {
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("DELETE FROM Oto WHERE bienKiemSoat = ?");
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
    public List<Oto> timKiemOto(String bienKiemSoat) {
        List<Oto> otos = new ArrayList<>();
        try {
            Connection connection = ConnectionDbManager.ConnectionDb();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Oto WHERE bienKiemSoat LIKE ?");
            statement.setString(1, "%" + bienKiemSoat + "%");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Oto oto = new Oto();
                oto.setBienKiemSoat(rs.getString("bienKiemSoat"));
                oto.setTenHangSanXuat(rs.getString("tenHangSanXuat"));
//                oto.setNgaySanXuat(rs.getDate("ngaySanXuat"));
                oto.setChuSoHuu(rs.getString("chuSoHuu"));
                oto.setSoChoNgoi(rs.getInt("soChoNgoi"));
                oto.setKieuXe(rs.getString("kieuXe"));
                otos.add(oto);
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return otos;
    }
}
