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
public class Hexagono implements Poligono{

    double lado, radio, apotema;
    public Hexagono(double Lado, double Radio){
        this.lado = Lado;
        this.radio = Radio;
    }
    @Override
    public double area() {
        apotema = Math.sqrt(Math.pow(radio,2) - Math.pow(lado,2));
        return (perimetro()*apotema)/2;
    }

    @Override
    public double perimetro() {
       return 6*lado; 
    }
    
}
