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
public class Octagono extends Hexagono{
    
    public Octagono(double Lado, double Radio) {
        super(Lado, Radio);
    }
    @Override
    public double perimetro(){
        return lado*8;
    }
}
