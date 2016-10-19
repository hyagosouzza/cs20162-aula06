/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.hyagosouzza.cs20162aula06.cpf;

/**Classe para verificar a validade de um cpf.
 * @author Hyago Vieira de Souza
 * @version 1.1
 */
public class Cpf
{ 
    /**
     * Método para retornar um boleano sobre a validade de um cpf.
     * @param  d final int[] - vetor com 11 posições
     * @return boolean - j == d[limitej] && k == d[limitek]
     */
    public final boolean cpf(final int[]d) {
        int contador, sk = 0, sj = 0;
        final int limitej = 9, limitek = 10, onze = 11, dez = 10;
        for (contador = 0; contador < limitej; contador++) {
            sj = sj + (contador + 1) * d[contador];
        }
        for (contador = 1; contador < limitek; contador++) {
            sk = sk + contador * d[contador];
        }
        int j = (sj % onze) % dez;
        int k = (sk % onze) % dez;
        return j == d[limitej] && k == d[limitek];
    }
}
