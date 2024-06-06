/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newui;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author Bhaskar
 */
// insert into student
// (stdName,stdGuardian,gender,phone,email,address,class,fee) values
// ("Test","Test","Test","Test","Test","Test","Test",200)
// "insert into student
// (stdName,stdGuardian,gender,phone,email,address,class,fee)
// values('"+stdName+"','"+stdName+"','"+stdName+"','"+stdName+"','"+stdName+"','"+stdName+"','"+stdName+"'");

public class DatabaseConn {

    // This code is used for connecting to the database
    final static String driver = "com.mysql.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost:3306/student";
    final static String user = "root";
    final static String pass = "";

    public static Connection connection() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
