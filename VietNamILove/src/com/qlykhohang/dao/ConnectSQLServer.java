/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlykhohang.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ConnectSQLServer {
//cách 1
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "DESKTOP-TNKAK16";
        String sqlInstanceName = "";
        String database = "QuanLyKhoHang";
        String userName = "TanMinh";
        String password = "phuongkute1";
        return getConnection(hostName, sqlInstanceName, database, userName, password);
    }

    public static Connection getConnection(String hostName, String sqlInstanceName, String database, String userName, String password)
            throws ClassNotFoundException, SQLException {
        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + database;
        Connection con = DriverManager.getConnection(connectionURL, userName, password);
        return con;
    }
    
    
//cách 2
//    public static Connection getConnection()  {
//        String url = "jdbc:jtds:sqlserver://DESKTOP-TNKAK16:1433/QuanLyKhoHang";
//        try {
//            Class.forName("net.sourceforge.jtds.jdbc.Driver");
//            return DriverManager.getConnection(url);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ConnectSQLServer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ConnectSQLServer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
}
