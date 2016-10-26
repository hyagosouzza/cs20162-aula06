/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula06.cpf;

/**
 * Classe para verificar a validade de um cpf.
 * @version 1.1
 */
public class CpfDois {

    /**
     * Método para retornar um boleano sobre a validade de um cpf.
     * @param d final int[] - vetor com 11 posições
     * @return boolean - j == d[nove] && k == d[dez]
     */
    public final boolean cpfDois(final int[]d) {
        final int dobroDeCinco = 10;
        final int dobroDeCincoMaisUm = 11;
        final int dobroDeCincoMenosDois = 8;
        final int dobroDeCincoMenosUm = 9;
        final int cincoMaisDois = 7;
        final int umMenosUm = 0;
        final int metadeDeDois = 1;
        int c = cincoMaisDois;
        int p = d[dobroDeCincoMenosDois];
        int s = d[dobroDeCincoMenosDois];
        while (umMenosUm <= c) {
            p = p + d[c];
            s = s + p;
            c = c - metadeDeDois;
        }
        int j = (s % dobroDeCincoMaisUm) % dobroDeCinco;
        int k = ((s - p + dobroDeCincoMenosUm * j) % dobroDeCincoMaisUm)
            % dobroDeCinco;
        return j == d[dobroDeCincoMenosUm] && k == d[dobroDeCinco];
    }
}
