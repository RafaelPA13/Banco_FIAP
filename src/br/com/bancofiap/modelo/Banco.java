package br.com.bancofiap.modelo;

public class Banco {
    public void criarConta(String nomeTitular, int id) {
        Conta novaConta = new Conta();
        novaConta.setNomeTitular(nomeTitular);
        novaConta.setId(id);
        System.out.println("Bem vindo ao Banco FIAP " + nomeTitular + "obrigado por criar a sua conta");
    }
}
