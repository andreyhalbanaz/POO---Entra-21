package org.example;

import java.time.LocalDate;
import java.time.Period;

public abstract class Beneficiario {
    private String cpf;
    private String nome;
    private LocalDate dataDeNascimento;
    private TipoCobertura tipoCobertura;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public int calcularIdade() {

        return Period
                .between(dataDeNascimento, LocalDate.now())
                .getYears();
    }
}

