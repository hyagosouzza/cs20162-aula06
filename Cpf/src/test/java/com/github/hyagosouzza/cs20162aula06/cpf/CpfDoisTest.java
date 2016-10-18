package com.github.hyagosouzza.cs20162aula06.cpf;

import org.junit.Test;

import static org.junit.Assert.*;

public class CpfDoisTest {
    
    @Test
    public void testCpfDois() {
        String vetor = Long.toString(67076288362L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois2() {
        String vetor = Long.toString(12345678513L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois3() {
        String vetor = Long.toString(87939254332L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois4() {
        String vetor = Long.toString(47079240344L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois5() {
        String vetor = Long.toString(52128430305L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois6() {
        String vetor = Long.toString(53426757826L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois7() {
        String vetor = Long.toString(62336306301L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois8() {
        String vetor = Long.toString(34301768408L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois10() {
        String vetor = Long.toString(52128430304L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois11() {
        String vetor = Long.toString(52128430302L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpfDois12() {
        String vetor = Long.toString(52128430205L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfDois instance = new CpfDois();
        boolean result = instance.cpfDois(d);
        assertEquals(expResult, result);
    }
}
