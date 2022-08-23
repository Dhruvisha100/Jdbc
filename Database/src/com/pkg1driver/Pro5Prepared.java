/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg1driver;

import com.pkg1connetion.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author OWNER
 */
public class Pro5Prepared {

    public static void main(String args[]) {
        try {
            Connection con = Conn.getCon();

            String sql = "insert into employee values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, 5);//1 specifies the first parameter in the query  
            st.setString(2, "Ratan");
            st.setString(3, "bio");
            st.setInt(4, 70000);
           int i = st.executeUpdate();
            System.out.println(i + "insert");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
