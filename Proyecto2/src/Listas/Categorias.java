/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Categorias implements Serializable{
    public NodoDoble inicio, fin;
    public int contador;
    public Categorias(){
        inicio=fin=null;
    }
    // mira si esta vacia
    public boolean isVacio(){
        return inicio==null;
    }
    //Agrega un nodo al final de la lista
    public void addFinal(String dato){
        if (!isVacio()) {
            fin=new NodoDoble(dato, null, fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(dato);
        }
    }
    //Agrega un nodo al incio de la Lista
     public void addInicio(String dato){
        if (!isVacio()) {
            inicio=new NodoDoble(dato, inicio, null);
            inicio.siguiente.anterior=inicio;
            JOptionPane.showMessageDialog(null, "la categoria a sido guardada");
            contador++;
        }else{
            inicio=fin=new NodoDoble(dato);
            contador++;
            JOptionPane.showMessageDialog(null, "la categoria a sido guardada");
        }
    }
     public void buscar(String e, String nombreimagen){
        NodoDoble actual;
        actual = inicio;
        while (actual!=null) {
            if (actual.datos.equals(e)) {;
                actual.imagenes.nuevoNodo(nombreimagen);
            }else{
                JOptionPane.showMessageDialog(null, "La categoria no existe");
            }
            actual=actual.siguiente;
        }
    }
     public boolean buscarnodoregresivo(String e){
        NodoDoble actual;
        actual = inicio;
        boolean encontrado=false;
        while (actual!=null) {
            if (actual.datos.equals(e)) {
                encontrado=true;
            }else{
                encontrado=false;
            }
            actual=actual.siguiente;
            if (encontrado==true) {
                break;
            }
        }
        return encontrado;
    }
     public String[] mostrarDatos(){
        String datos[] = new String[contador];
        if (!isVacio()) {
            NodoDoble aux = inicio;
            for (int i = 0; i < contador; i++) {
                datos[i]= (String) aux.datos;
                aux = aux.siguiente;
            }
        }
        return datos;   
}
}
