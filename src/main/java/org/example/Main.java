package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TipoCobertura cobertura = new TipoCobertura();

        cobertura.setTipo("Plano completo");


        Titular titular = new Titular();

        titular.setNome("Andrey");

        titular.setCpf("12848610905");

        titular.setDataDeNascimento(LocalDate.of(1995, 4, 16));

        Dependente dependente = new Dependente();

        dependente.setCpf("99876549065");

        dependente.setNome("Juliano");

        dependente.setDataDeNascimento(LocalDate.of(2001, 8, 19));

        dependente.setTipoCobertura(cobertura);

        dependente.setTitular(titular);

        titular.adicionarDependente(dependente);


        Aposentado aposentado = new Aposentado();

        aposentado.setNome("Rute");

        aposentado.setCpf("76949089003");

        aposentado.setDataDeNascimento(LocalDate.of(1973, 11, 7));

        aposentado.setTipoCobertura(cobertura);

        System.out.printf("Mensalidade Titular: %.2f%n", titular.calcularMensalidade());

        System.out.printf("Mensalidade Dependente: %.2f%n", dependente.calcularMensalidade());

        System.out.printf("Mensalidade Aposentado: %.2f%n",  aposentado.calcularMensalidade());

    }
}
