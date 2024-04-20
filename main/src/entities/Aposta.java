package entities;

import entities.tipoDeAposta.PremioCentenaSeca;
import entities.tipoDeAposta.PremioDezena;
import entities.tipoDeAposta.PremioGrupo;
import entities.tipoDeAposta.PremioMilharSeca;

import java.util.Arrays;
import java.util.Vector;

public class Aposta {

    private  Double valorAposta;
    private  Jogador jogador;
    private PremioGrupo grupo;
    private PremioMilharSeca milhar;
    private  PremioCentenaSeca centena;
    private PremioDezena dezena;

    private Integer numeroMilhar;
    private  Integer numeroCentena;
    private Integer numeroDezena;


    /**
     * Aposta com grupo - animal
     **/
    public Aposta(Double saldoJogador, Jogador jogador, PremioGrupo grupo) {
        this.valorAposta = saldoJogador;
        this.jogador = jogador;
        this.grupo = grupo;
    }

    /**
     * Aposta com milhar
     **/
    public Aposta(Double saldoJogador, Jogador jogador, PremioMilharSeca milhar, Integer numeroMilhar) {
        valorAposta = saldoJogador;
        this.jogador = jogador;
        this.milhar = milhar;
        this.numeroMilhar = numeroMilhar;
    }


    /**
     * Aposta com centena
     **/

    public Aposta(Double saldoJogador, Jogador jogador, PremioCentenaSeca centena, Integer numeroCentena) {
        valorAposta = saldoJogador;
        this.jogador = jogador;
        this.centena = centena;
        this.numeroCentena = numeroCentena;
    }

    /**
     * Aposta com dezena
     **/
    public Aposta(Double saldoJogador, Jogador jogador, PremioDezena dezena, Integer numeroDezena) {
        valorAposta = saldoJogador;
        this.jogador = jogador;
        this.dezena = dezena;
        this.numeroDezena = numeroDezena;
    }


    /**
     * Getters & Setters
     **/


    public Double getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(Double valorAposta) {
        this.valorAposta = valorAposta;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public PremioGrupo getGrupo() {
        return grupo;
    }

    public void setGrupo(PremioGrupo grupo) {
        this.grupo = grupo;
    }

    public PremioMilharSeca getMilhar() {
        return milhar;
    }

    public void setMilhar(PremioMilharSeca milhar) {
        this.milhar = milhar;
    }

    public PremioCentenaSeca getCentena() {
        return centena;
    }

    public void setCentena(PremioCentenaSeca centena) {
        this.centena = centena;
    }

    public PremioDezena getDezena() {
        return dezena;
    }

    public void setDezena(PremioDezena dezena) {
        this.dezena = dezena;
    }

    public Integer getNumeroMilhar() {
        return numeroMilhar;
    }

    public void setNumeroMilhar(Integer numeroMilhar) {
        this.numeroMilhar = numeroMilhar;
    }

    public Integer getNumeroCentena() {
        return numeroCentena;
    }

    public void setNumeroCentena(Integer numeroCentena) {
        this.numeroCentena = numeroCentena;
    }

    public Integer getNumeroDezena() {
        return numeroDezena;
    }

    public void setNumeroDezena(Integer numeroDezena) {
        this.numeroDezena = numeroDezena;
    }

    /**
     * Logica de realizar a aposta
     **/

    public String detalhesCentena() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*********************\n");
        stringBuilder.append("**     Aposta:     **\n");
        stringBuilder.append("*********************\n");

        stringBuilder.append(this.jogador).append("\n");
        stringBuilder.append("valorAposta: R$").append(String.format("%.2f", this.valorAposta)).append("\n");
        stringBuilder.append("centena: ").append(this.numeroCentena).append("\n");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Aposta{" +
                "valorAposta=" + valorAposta +
                " \njogador=" + jogador +
                " \ngrupo=" + grupo +
                " \nmilhar=" + milhar +
                " \ncentena=" + centena +
                " \ndezena=" + dezena +
                " \nnumeroMilhar=" + numeroMilhar +
                " \nnumeroCentena=" + numeroCentena +
                " \nnumeroDezena=" + numeroDezena +
                '}';
    }
}

