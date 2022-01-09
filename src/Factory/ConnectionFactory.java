package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionFactory {

        public Connection conectaDB(){
            Connection conn = null;
            
            try {
                String url = "jdbc:mysql://localhost:3306/banco?user=root";
                conn = DriverManager.getConnection(url);
                
            } catch (Exception erro) { 
                JOptionPane.showMessageDialog(null, "ConnectionFactory" + erro.getMessage());
            }
            return conn;    
        }  
}
