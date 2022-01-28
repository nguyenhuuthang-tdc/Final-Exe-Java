/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import qltour_de12.DAL.DAL_Connections;
import qltour_de12.GUI.QLTour;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        QLTour qlTour = new QLTour();
        qlTour.show();
    }

}
