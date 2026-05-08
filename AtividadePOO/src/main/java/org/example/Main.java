package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {

        CartaoCredito cartao1;

        cartao1 = new CartaoCredito("080425", "Fernando", "666", 5000);

        ProcessadorPagamento p;

        p = new ProcessadorPagamento(cartao1);

        p.executarVenda(2000);

        p.executarVenda(4000);

    }
}
