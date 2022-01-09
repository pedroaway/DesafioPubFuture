package ControleDTO;


public class ControleDeContas {
    
    private String Inst;
    private String Tipo;
    private double Saldo;

    public String getInst() {
        return Inst;
    }
    public void setInst(String Inst) {
        this.Inst = Inst;
    }

    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    

}
