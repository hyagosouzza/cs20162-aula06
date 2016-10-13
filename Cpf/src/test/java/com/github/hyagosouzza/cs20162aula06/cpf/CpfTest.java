package com.github.hyagosouzza.cs20162aula06.cpf;
import org.junit.Test;
import static org.junit.Assert.*;
public class CpfTest {
    @Test
    public void testCpf() {
        String vetor = Long.toString(67076288362L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf2() {
        String vetor = Long.toString(12345678513L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf3() {
        String vetor = Long.toString(87939254332L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf4() {
        String vetor = Long.toString(47079240344L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf5() {
        String vetor = Long.toString(52128430305L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf6() {
        String vetor = Long.toString(53426757826L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf7() {
        String vetor = Long.toString(62336306301L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf8() {
        String vetor = Long.toString(34301768408L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf9() {
        String vetor = Long.toString(12345678910L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf10() {
        String vetor = Long.toString(52128430304L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf11() {
        String vetor = Long.toString(52128430302L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpf12() {
        String vetor = Long.toString(52128430205L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
}
