package com.github.hyagosouzza.cs20162aula06.cpf;

import org.junit.Test;

import static org.junit.Assert.*;

public class CpfTest {
    
    @Test
    public void testCpf() {
        String vetor = Long.toString(67076288362L);
        int d[] = new int[11]{6,7,0,7,6,2,8,8,3,6,2};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf2() {
        String vetor = Long.toString(12345678513L);
        int d[] = new int[11]{1,2,3,4,5,6,7,8,5,1,3};
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf3() {
        String vetor = Long.toString(87939254332L);
        int d[] = new int[11]{8,7,9,3,9,2,5,4,3,3,2};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf4() {
        String vetor = Long.toString(47079240344L);
        int d[] = new int[11]{4,7,0,7,9,2,4,0,3,4,4};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf5() {
        String vetor = Long.toString(52128430305L);
        int d[] = new int[11]{5,2,1,2,8,4,3,0,3,0,5};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf6() {
        String vetor = Long.toString(53426757826L);
        int d[] = new int[11]{5,3,4,2,6,7,5,7,8,2,6};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf7() {
        String vetor = Long.toString(62336306301L);
        int d[] = new int[11]{6,2,3,3,6,3,0,6,3,0,1};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf8() {
        String vetor = Long.toString(34301768408L);
        int d[] = new int[11]{3,4,3,0,1,7,6,8,4,0,8};
        boolean expResult = true;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf9() {
        String vetor = Long.toString(12345678910L);
        int d[] = new int[11]{1,2,3,4,5,6,7,8,9,1,0};
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf10() {
        String vetor = Long.toString(52128430304L);
        int d[] = new int[11]{5,2,1,2,8,4,3,0,3,0,4};
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf11() {
        String vetor = Long.toString(52128430302L);
        int d[] = new int[11]{5,2,1,2,8,4,3,0,3,0,2};
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCpf12() {
        String vetor = Long.toString(52128430205L);
        int d[] = new int[11]{5,2,1,2,8,4,3,0,2,0,5};
        boolean expResult = false;
        Cpf instance = new Cpf();
        boolean result = instance.cpf(d);
        assertEquals(expResult, result);
    }
}
