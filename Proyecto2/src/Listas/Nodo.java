/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author ricar
 */
public class Nodo {
     public Nodo siguiente;
    public Object datos;
    public final Categorias categoria = new Categorias();
    public Nodo(String d, Nodo sig){
        datos=d;
        siguiente=sig; 
    }
    Object verDato(){
        return this.datos;
    }
}
