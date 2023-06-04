package entidades;

public class poobanco {

private double numerodaconta;
private String nomedotitular;
private double saldo;

    public poobanco(double numerodaconta, String nomedotitular) {
    this.numerodaconta = numerodaconta;
    this.nomedotitular = nomedotitular;
    }

    public poobanco(double numerodaconta, String nomedotitular, double depositoinicial) {
    this.numerodaconta = numerodaconta;
    this.nomedotitular = nomedotitular;
    depositar(depositoinicial);
    }

    public double getNumerodaconta() {
        return numerodaconta;
    }

    public String getNomedotitular() {
        return nomedotitular;
    }

    public void setNomedotitular(String nomedotitular) {
        this.nomedotitular = nomedotitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double operacao) {
        this.saldo += operacao;
    }

    public void sacar(double operacao) {
        this.saldo -= operacao + 5.0;
    }

    public String toString() {
        return "Nome do titular: " + nomedotitular + "," +
               " Número da conta: " + numerodaconta + "," + 
               " Saldo: " + String.format("%.3f", saldo);
    } 
}
