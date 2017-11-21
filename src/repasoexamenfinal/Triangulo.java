/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamenfinal;

/**
 *
 * @author JoseCarlos
 */
public class Triangulo implements Poligono{

    /**
     * @return the ladoA
     */
    public int getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * @return the ladoC
     */
    public int getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    private  int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    
    public Triangulo(int a,int b, int c){
        this.ladoA = a;
        this.ladoB = b; 
        this.ladoC = c;
    }
    
    
    @Override
    public double area() {
        double q = (ladoA + ladoB + ladoC)/2;
        return Math.sqrt(q *(q-ladoA) * (q-ladoB) * (q-ladoC));
    }

    @Override
    public double perimetro() {
        int perimetrotriangulo = getLadoA() + getLadoB() + getLadoC();
        return perimetrotriangulo;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}
