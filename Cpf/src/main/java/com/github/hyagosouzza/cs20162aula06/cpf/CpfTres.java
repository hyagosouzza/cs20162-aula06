/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula06.cpf;

/**
 * Classe para verificar a validade de um cpf.
 * @version 1.1
 */
public class CpfTres {

    /**
     * Metodo para retornar um boleano sobre a validade de um cpf.
     * @param d final int[] - vetor com 11 posições
     * @return boolean - j == d[9] && k == d[10]
     */
    public final boolean cpfTres(final int[]d) {
        final int oitoMaisUm = 9;
        final int dobroDeCincoMaisUm = 11;
        final int dobroDeCinco = 10;
        final int metadeDeDezMaisDois = 7;
        final int metadeDeDezMaisUm = 6;
        final int metadeDeDez = 5;
        final int metadeDeOito = 4;
        final int metadeDeOitoMenosUm = 3;
        final int dobroDeQuatro = 8;
        final int dobroDeUm = 2;
        final int doisMenosUm = 1;
        final int umMenosUm = 0;
        int p = d[dobroDeQuatro];
        int s = d[dobroDeQuatro];
        p = p + d[metadeDeDezMaisDois];
        s = s + p;
        p = p + d[metadeDeDezMaisUm];
        s = s + p;
        p = p + d[metadeDeDez];
        s = s + p;
        p = p + d[metadeDeOito];
        s = s + p;
        p = p + d[metadeDeOitoMenosUm];
        s = s + p;
        p = p + d[dobroDeUm];
        s = s + p;
        p = p + d[doisMenosUm];
        s = s + p;
        p = p + d[umMenosUm];
        s = s + p;
        int j = (s % dobroDeCincoMaisUm) % dobroDeCinco;
        int k = ((s - p + oitoMaisUm * j) % dobroDeCincoMaisUm) % dobroDeCinco;
        return j == d[oitoMaisUm] && k == d[dobroDeCinco];
    }
}
