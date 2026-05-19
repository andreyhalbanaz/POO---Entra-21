package org.example;

public class Aposentado extends Titular implements CalcularMensalidade {

    @Override
    public double calcularMensalidade() {
        return 0;
    }
}
