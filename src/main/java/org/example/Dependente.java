package org.example;

public class Dependente extends Beneficiario implements CalcularMensalidade {

    private Titular titular;

    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public double calcularMensalidade() {

        int idade = calcularIdade();

        double valorBase;

        if (idade >= 18 && idade <= 59) {
            valorBase = 180;

        } else {
            valorBase = 620;
        }
        return valorBase * 0.7;

    }
}
