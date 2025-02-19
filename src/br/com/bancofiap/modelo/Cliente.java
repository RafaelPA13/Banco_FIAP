package br.com.bancofiap.modelo;

public class Cliente{
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.criarConta("Rafael", 1);
        minhaConta.depositar();
        minhaConta.obterSaldo();
    }
}
