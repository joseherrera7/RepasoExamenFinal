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
public class Cuadrado extends Cuadrilatero {
    
    public Cuadrado(double Lado1, double Lado2) {
        super(Lado1, Lado2);
    }
    @Override
    public double area() {
        return lado2*lado2;
    }

    @Override
    public double perimetro() {
       return 2*(lado1)+ 2*(lado2);
    }
}
