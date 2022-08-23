/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg1driver;

import com.pkg1connetion.Conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Pro2Insert {

    public static void main(String args[]) {
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            String sql = "insert into employee values(2,'raajvann','comp',200300)";
            st.executeUpdate(sql);
            System.out.println("insert");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
