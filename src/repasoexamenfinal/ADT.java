/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoexamenfinal;

import gt.url.edu.demoestructuras.listas.LinkedPositionalList;

/**
 *
 * @author JoseCarlos
 */
public class ADT {
    LinkedPositionalList<Carta> ListaPosicional = new LinkedPositionalList<>();
    
    public void agregarCarta(int valor, String categoria){
        Carta nuevaCarta = new Carta();
        nuevaCarta.setValor(valor);
        nuevaCarta.setCategoria(categoria);
        ListaPosicional.addLast(nuevaCarta);
    }
     public void jugar(String categoria){
         
         for(Carta carta : ListaPosicional){
             if (carta.getCategoria().equals(categoria)) {
                 //ListaPosicional.remove();
             }
         }
     }
}
