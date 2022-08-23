/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg1connetion;

import java.sql.*;

public class Conn {

    public static java.sql.Connection getCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//intenship8sem
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/intenship8sem?zeroDateTimeBehavior=convertToNull", "root", "root");
        return con;
    }
}
