package exampleException.entities;

import java.time.LocalDate;

public class CartaoDeCredito {
    private String titular;
    private String numero;
    private String cvv;
    private LocalDate dataDeExpiracao;

    public CartaoDeCredito(){}

    public CartaoDeCredito(String titular, String numero, String cvv, LocalDate dataDeExpiracao) {
        this.titular = titular;
        this.numero = numero;
        this.cvv = cvv;
        this.dataDeExpiracao = dataDeExpiracao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getDataDeExpiracao() {
        return dataDeExpiracao;
    }

    public void setDataDeExpiracao(LocalDate dataDeExpiracao) {
        this.dataDeExpiracao = dataDeExpiracao;
    }

    @Override
    public String toString() {
        return "CartaoDeCredito{" +
                "titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                ", cvv='" + cvv + '\'' +
                ", dataDeExpiracao=" + dataDeExpiracao +
                '}';
    }
}
