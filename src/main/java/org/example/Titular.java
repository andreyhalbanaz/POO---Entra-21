package org.example;

import java.util.ArrayList;
import java.util.List;

public class Titular extends Beneficiario implements CalcularMensalidade {

    private List<Dependente> dependentes;

    public Titular() {
        dependentes = new ArrayList<>();

    }

    public void adicionarDependente(Dependente dependente) {
        if (dependentes.size() >= 3) {
            System.out.println("Limite atingido");
            return;
        }
        dependentes.add(dependente);
        System.out.println("Dependente adicionado");
    }

    public List <Dependente> getDependentes() {
        return dependentes;

    }

    @Override
    public double calcularMensalidade() {

        int idade = calcularIdade();

        if (idade >= 18 && idade <= 59) {
            return 180;
        }
        return 620;

    }

}


