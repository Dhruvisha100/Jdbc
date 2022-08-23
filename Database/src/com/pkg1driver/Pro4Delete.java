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

public class Pro4Delete {
       public static void main(String args[]) {
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            String sql = "delete  from employee where E_ID=1";
            st.executeUpdate(sql);
            System.out.println("delete");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
