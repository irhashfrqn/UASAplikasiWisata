/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitindonesia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author irhas
 */
public class Session {
    private static String username;    
    private static String nama;
    private static String userID;


    public static String getUsername() {
        return username;
    }
    public static String getNama() {
        String nama = "";
        // Koneksi ke database untuk mengambil nama berdasarkan userID
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/visit_indonesia", "root", "");
             PreparedStatement stmt = conn.prepareStatement("SELECT nama_lengkap FROM users WHERE id = ?")) {
            stmt.setString(1, userID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                nama = rs.getString("nama_lengkap");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nama;
    }
    
    public static String getUserID() {
        return userID;
    }

    public static void setUsername(String username) {
        Session.username = username;
    }
    public static void setNama(String nama) {
        Session.nama = nama;
    }

    static void setUserID(String userID) {
        Session.userID = userID;
    }
}