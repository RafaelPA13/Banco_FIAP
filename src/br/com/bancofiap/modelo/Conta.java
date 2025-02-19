package br.com.bancofiap.modelo;

public class Conta extends Banco{
    private String nomeTitular;
    private int id;
    private double saldo = 0.0;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        setSaldo(100.0);
        System.out.println("Seu saldo de R$100,00 oferecido pelo Banco FIAP foi depositado, aproveiter!");
    }

    public void obterSaldo() {
        System.out.println("Seu saldo atual é de R$:" + getSaldo());
    }
}
