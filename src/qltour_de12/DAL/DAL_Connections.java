/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DAL_Connections {
    public static Connection connect = null;
    public static String url = "jdbc:mysql://localhost:3308/ql_tour?zeroDateTimeBehavior=convertToNull";
    public static String username = "root";
    public static String pwd = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = (Connection) DriverManager.getConnection(url, username, pwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAL_Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
}
