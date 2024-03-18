package entities;

import entities.tipoDeAposta.PremioCentenaSeca;
import entities.tipoDeAposta.PremioDezena;
import entities.tipoDeAposta.PremioGrupo;
import entities.tipoDeAposta.PremioMilharSeca;

import java.util.Arrays;
import java.util.Vector;

public class Aposta {

    private static Double valorAposta;
    private static Jogador jogador;
    private PremioGrupo grupo;
    private PremioMilharSeca milhar;
    private static PremioCentenaSeca centena;
    private PremioDezena dezena;

    private Vector<Integer> vectmilhar;
    private static Vector<Integer> vectcentena;
    private Vector<Integer> vectDezena;


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
    public Aposta(Double saldoJogador, Jogador jogador, PremioMilharSeca milhar, Vector<Integer> vectmilhar) {
        this.valorAposta = saldoJogador;
        this.jogador = jogador;
        this.milhar = milhar;
        this.vectmilhar = vectmilhar;
    }


    /**
     * Aposta com centena
     **/

    public Aposta(Double saldoJogador, Jogador jogador, PremioCentenaSeca centena, Vector<Integer> vectcentena) {
        this.valorAposta = saldoJogador;
        this.jogador = jogador;
        this.centena = centena;
        this.vectcentena = vectcentena;
    }

    /**
     * Aposta com dezena
     **/
    public Aposta(Double saldoJogador, Jogador jogador, PremioDezena dezena, Vector<Integer> vectDezena) {
        this.valorAposta = saldoJogador;
        this.jogador = jogador;
        this.dezena = dezena;
        this.vectDezena = vectDezena;
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

    public Vector<Integer> getVectmilhar() {
        return vectmilhar;
    }

    public void setVectmilhar(Vector<Integer> vectmilhar) {
        this.vectmilhar = vectmilhar;
    }

    public Vector<Integer> getVectcentena() {
        return vectcentena;
    }

    public void setVectcentena(Vector<Integer> vectcentena) {
        this.vectcentena = vectcentena;
    }

    public Vector<Integer> getVectDezena() {
        return vectDezena;
    }

    public void setVectDezena(Vector<Integer> vectDezena) {
        this.vectDezena = vectDezena;
    }

    /**
     * Logica de realizar a aposta
     **/

    public static String detalhes() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*********************\n");
        stringBuilder.append("**     Aposta:     **\n");
        stringBuilder.append("*********************\n");

        stringBuilder.append("valorAposta: R$").append(String.format("%.2f", valorAposta)).append("\n");
        stringBuilder.append(jogador).append("\n");
        stringBuilder.append("centena: ").append(Arrays.toString(vectcentena.toArray())).append("\n");
        return stringBuilder.toString();
    }


}

