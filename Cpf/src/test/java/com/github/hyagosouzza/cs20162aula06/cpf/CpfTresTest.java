package com.github.hyagosouzza.cs20162aula06.cpf;
import org.junit.Test;
import static org.junit.Assert.*;
public class CpfTresTest {
    @Test
    public void testCpfTres() {
        String vetor = Long.toString(67076288362L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres2() {
        String vetor = Long.toString(12345678513L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres3() {
        String vetor = Long.toString(87939254332L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres4() {
        String vetor = Long.toString(47079240344L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres5() {
        String vetor = Long.toString(52128430305L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres6() {
        String vetor = Long.toString(53426757826L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres7() {
        String vetor = Long.toString(62336306301L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres8() {
        String vetor = Long.toString(34301768408L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = true;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
        @Test
    public void testCpfTres10() {
        String vetor = Long.toString(52128430304L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres11() {
        String vetor = Long.toString(52128430302L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
    @Test
    public void testCpfTres12() {
        String vetor = Long.toString(52128430205L);
        int d[] = new int[11];
        for(int i = 0; i < 11; i++){
            d[i] = Integer.parseInt(vetor.substring(i, i+1));
        }
        boolean expResult = false;
        CpfTres instance = new CpfTres();
        boolean result = instance.cpfTres(d);
        assertEquals(expResult, result);
    }
}
