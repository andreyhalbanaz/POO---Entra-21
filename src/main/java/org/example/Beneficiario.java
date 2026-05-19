package org.example;

import java.time.LocalDate;

public abstract class Beneficiario  {
    private String cpf;
    private String nome;
    private LocalDate dataDeNascimento;
    private TipoCobertura tipoCobertura;

    public double calcularMensalidadeBase() {
        return 0.0;
    }
}
