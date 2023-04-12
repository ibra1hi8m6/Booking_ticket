/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first.java;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author M M Salah
 */
public class CONO {
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cityclub","root","M123");
            return  con;
        } catch (Exception e) {
            return null;
        }
    }
    
}
