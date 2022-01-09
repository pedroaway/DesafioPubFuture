package Factory;


import ControleDTO.ControleDeContas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Contas {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFuncionario(ControleDeContas obtControle){
    String sql = "INSERT INTO conta (nome, saldo) values (?,?)"; 
   
    conn = new ConnectionFactory().conectaDB();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, obtControle.getInst());
            pstm.setDouble(2, obtControle.getSaldo( ));
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ConnectionFActory" + erro);
        }
    
    }
}
