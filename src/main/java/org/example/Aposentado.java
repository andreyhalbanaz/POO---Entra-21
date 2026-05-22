package org.example;

public class Aposentado extends Titular implements CalcularMensalidade {

    @Override
    public double calcularMensalidade() {
        int idade = calcularIdade();

        double valorBase;

        if (idade >= 18 && idade <= 59) {

            valorBase = 180;

        } else {
            valorBase = 620;
        }

        return valorBase - 20;
    }

}
