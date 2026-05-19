package org.example;

public class Titular extends Beneficiario implements CalcularMensalidade {
    private Dependente dependente;

    @Override
    public double calcularMensalidade() {
        return 0;
    }
}
