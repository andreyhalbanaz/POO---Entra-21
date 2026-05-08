package org.example;

public class ProcessadorPagamento {

    private CartaoCredito cartao;

    public ProcessadorPagamento(CartaoCredito c) {
        cartao = c;

    }

    public void executarVenda(double valor) {

        if (valor <= cartao.getLimiteDisponivel()) {

        double novoLimite = cartao.getLimiteDisponivel() - valor;
        cartao.alterarLimite(novoLimite);

        System.out.println("Venda aprovada");
        System.out.println("Limite: " + cartao.getLimiteDisponivel());

    } else {

            System.out.println("Transacao negada");
        }
    }
}


