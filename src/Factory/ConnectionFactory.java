package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionFactory {

        public Connection conectaDB(){
            Connection conn = null;
            
            try {
                String url = "jdbc:mysql://localhost/banco?user=root&password=";
                conn = DriverManager.getConnection(url);
                
            } catch (Exception erro) { 
                JOptionPane.showMessageDialog(null, "ConectionFactory" + erro.getMessage());
            }
            return conn;    
        }  
}
