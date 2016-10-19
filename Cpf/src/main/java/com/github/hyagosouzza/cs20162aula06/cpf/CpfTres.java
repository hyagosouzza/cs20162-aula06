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
        final int nove = 9, onze = 11, dez = 10, sete = 7, seis = 6, cinco = 5,
                quatro = 4, tres = 3, dois = 2, um = 1, zero = 0, oito = 8;
        int p = d[oito];
        int s = d[oito];
        p = p + d[sete];
        s = s + p;
        p = p + d[seis];
        s = s + p;
        p = p + d[cinco];
        s = s + p;
        p = p + d[quatro];
        s = s + p;
        p = p + d[tres];
        s = s + p;
        p = p + d[dois];
        s = s + p;
        p = p + d[um];
        s = s + p;
        p = p + d[zero];
        s = s + p;
        int j = (s % onze) % dez;
        int k = ((s - p + nove * j) % onze) % dez;
        return j == d[nove] && k == d[dez];
    }
}
