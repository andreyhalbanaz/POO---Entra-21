package org.example;

public class Dependente extends Beneficiario implements CalcularMensalidade {

    @Override
    public double calcularMensalidade() {
        return 0.0;
    }
}
