/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula06.cpf;

/**
 * Classe para verificar qual método é o mais rápido.
 * @version 1.1
 */
public class TempoEntreTres
{
    /**
     * Método para retornar uma String sobre o método mais rápido.
     * @param vetor final int[] - vetor com 11 posições
     * @return String - método mais rápido
     */
    public final String menorTempo(final int[]vetor) {
        Cpf instance = new Cpf();
        CpfDois instance2 = new CpfDois();
        CpfTres instance3 = new CpfTres();
        int contador;
        final int vezes = 10;
        //Método um.
        long tempoInicio = System.nanoTime();
        for (contador = 0; contador < vezes; contador++) {
            instance.cpf(vetor);
        }
        long tempo1 = System.nanoTime() - tempoInicio;
        //Método dois.
        long tempoInicio2 = System.nanoTime();
        for (contador = 0; contador < vezes; contador++) {
            instance2.cpfDois(vetor);
        }
        long tempo2 = System.nanoTime() - tempoInicio2;
        //Método três.
        long tempoInicio3 = System.nanoTime();
        for (contador = 0; contador < vezes; contador++) {
            instance3.cpfTres(vetor);
        }
        long tempo3 = System.nanoTime() - tempoInicio3;
        if (tempo2 < tempo1 && tempo2 < tempo3) {
            return "Cpf Dois é mais rápido.";
        } else if (tempo1 < tempo2 && tempo1 < tempo3) {
            return "Cpf Um é mais rápido.";
        } else if (tempo3 < tempo1 && tempo3 < tempo2) {
            return "Cpf Três é mais rápido.";
        } else {
            return "Não existe um mais rápido.";
        }
    }
}
