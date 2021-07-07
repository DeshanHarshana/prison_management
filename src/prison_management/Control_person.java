
package prison_management;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Control_person {
    Connection conn;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    public void insert(Model_Person mod){
        try {
            String url = "jdbc:sqlite:C://database/Prison_Management_Officers.db";
         
            String quary="insert into Person (ID,Name,Age,Gender,Details) values(?,?,?,?,?)";
            
            conn=DriverManager.getConnection(url);
        pst=conn.prepareStatement(quary);
        pst.setInt(1, mod.getID());
        pst.setString(2, mod.getName());
        pst.setString(3, mod.getAge());
        pst.setString(4, mod.getGender());
        pst.setString(5, mod.getDetails());
        
        
        pst.executeUpdate();
        System.out.println("Success");
        
        pst.close();
        conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
            
       
    }
     
        
     
}
