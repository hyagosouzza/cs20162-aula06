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
        final int dez = 10, onze = 11, zero = 0, oito = 8, nove = 9, sete = 7;
        int c = sete;
        int p = d[oito];
        int s = d[oito];
        while (zero <= c) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }
        int j = (s % onze) % dez;
        int k = ((s - p + nove * j) % onze) % dez;
        return j == d[nove] && k == d[dez];
    }
}
