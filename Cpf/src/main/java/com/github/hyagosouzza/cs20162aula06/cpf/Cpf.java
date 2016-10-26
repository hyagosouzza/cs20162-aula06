/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula06.cpf;

/**Classe para verificar a validade de um cpf.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class Cpf {

    /**
     * Método para retornar um boleano sobre a validade de um cpf.
     * @param  d final int[] - vetor com 11 posições
     * @return boolean - j == d[limitej] && k == d[limitek]
     */
    public final boolean cpf(final int[]d) {
        int contador, sk = 0, sj = 0;
        final int limitej = 9;
        final int limitek = 10;
        final int dobroDeCincoMaisUm = 11;
        final int dobroDeCinco = 10;
        for (contador = 0; contador < limitej; contador++) {
            sj = sj + (contador + 1) * d[contador];
        }
        for (contador = 1; contador < limitek; contador++) {
            sk = sk + contador * d[contador];
        }
        int j = (sj % dobroDeCincoMaisUm) % dobroDeCinco;
        int k = (sk % dobroDeCincoMaisUm) % dobroDeCinco;
        return j == d[limitej] && k == d[limitek];
    }
}
