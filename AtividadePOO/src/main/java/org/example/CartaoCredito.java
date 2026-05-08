package org.example;

    public class CartaoCredito {

    private String numeroCartao;
    private String titular;
    private double limiteDisponivel;
    private String cvv;

    public CartaoCredito(String numero, String nomeTitular, String codigo, double limite ) {

        numeroCartao = numero;
        titular = nomeTitular;
        cvv = codigo;
        limiteDisponivel = limite;


    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void alterarLimite(double novoLimite) {

        if (novoLimite >=0) {
            limiteDisponivel = novoLimite;

        }


    }

}
