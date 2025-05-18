package construtores.contaBancaria;

public class contaBanco {
    private String numeroConta;
    private String titular;
    private Double saldo;

    public contaBanco() {
        this.saldo = 0.0;
    }







    public void depositar(double valor){
       this.saldo += valor;
    }

    public void sacar(double valor){

    }






    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
