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
public class FabricaFiguras {
    public void crearFiguraCuatroLados(double lado1, double lado2){
        Cuadrado nuevoCuadrado = new Cuadrado(lado1, lado2);
        Cuadrilatero nuevoCuadrilatero = new Cuadrilatero(lado1, lado2);
        Rectangulo nuevoRectangulo = new Rectangulo(lado1, lado2);
        System.out.println("Area cuadrado: " + nuevoCuadrado.area() + "\n" + "Area cuadrilatero: " + nuevoCuadrilatero.area() + "\n" + "Area rectangulo: " + nuevoRectangulo.area());
        System.out.println("Perimetro cuadrado: " + nuevoCuadrado.perimetro() + "\n" + "Perimetro cuadrilatero: " + nuevoCuadrilatero.perimetro() + "\n" + "Perimetro rectangulo: " + nuevoRectangulo.perimetro());
    }
    public void crearPoligono(double lado, double radio){
        Hexagono nuevoHexagono = new Hexagono(lado, radio);
        Octagono nuevoOctagono = new Octagono(lado, radio);
        Pentagono nuevoPentagono = new Pentagono(lado, radio);                
        System.out.println("Area Hexagono: " + nuevoHexagono.area() + "\n" + "Area octagono: " + nuevoOctagono.area() + "\n" + "Area pentagono: " + nuevoPentagono.area());
        System.out.println("Perimetro Hexagono: " + nuevoHexagono.perimetro() + "\n" + "Perimetro octagono: " + nuevoOctagono.perimetro() + "\n" + "Perimetro pentagono: " + nuevoPentagono.perimetro());

    }
    public void crearTriangulos(int a, int b, int c){
        Triangulo nuevoTriangulo = new Triangulo(a, b, c);
        TrianguloEquilatero nuevoTrianguloEquilatero = new TrianguloEquilatero(a, b, c);
        TrianguloIsoceles nuevoTrianguloIsoceles = new TrianguloIsoceles(a, b, c);
        System.out.println("Area triangulo: " + nuevoTriangulo.area() + "\n" + "Area triangulo equilatero: " + nuevoTrianguloEquilatero.area() + "\n" + "Area triangulo isoceles: " + nuevoTrianguloIsoceles.area());
        System.out.println("Perimetro triangulo: " + nuevoTriangulo.perimetro() + "\n" + "Perimetro triangulo equilatero: " + nuevoTrianguloEquilatero.perimetro() + "\n" + "Perimetro triangulo isoceles: " + nuevoTrianguloIsoceles.perimetro());

    }
    
}
