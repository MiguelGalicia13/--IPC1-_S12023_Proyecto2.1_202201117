/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.io.Serializable;

/**
 *
 * @author ricar
 */
public class ListaImagenes implements Serializable {
    NodoCircular inicio,fin;
    public int contador=0;
    public ListaImagenes(){
        inicio=null;
        fin=null;
    }
    public void nuevoNodo(String data){
        NodoCircular aux = new NodoCircular();
        aux.datos = data;
        if (inicio==null) {
            inicio=aux;
            inicio.siguiente=inicio;
            aux.anterior=fin;
            fin=aux;
            contador++;
        }else{
            fin.siguiente=aux;
            aux.siguiente=inicio;
            aux.anterior=fin;
            fin=aux;
            inicio.anterior=fin;
            contador++;
        }
    }
    public String[] mostrardatos(){
        NodoCircular seleccionado = new NodoCircular();
        String contenido[] = new String[contador];
        seleccionado = inicio;
        do {
            for (int i = 0; i < contador; i++) {
                contenido[i]=(String) seleccionado.datos;
                seleccionado = seleccionado.siguiente;
            }
        } while (seleccionado!=inicio);   
        return contenido;
    }
}
