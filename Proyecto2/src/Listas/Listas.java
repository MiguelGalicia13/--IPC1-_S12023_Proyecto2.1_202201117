/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.io.Serializable;

public class Listas implements Serializable {
    private Nodo cabeza;
    private Nodo cola;
    private int contador = 0;
    
    public Listas(){
        cabeza=null;
        cola=null;
    }
    
    public void addInicio(String d){
        setContador(getContador() + 1);
        if (state()) {
            setCabeza(new Nodo(d, getCabeza()));
            setCola(getCabeza());
        }else{
            setCabeza(new Nodo(d, getCabeza()));
        }
    }
    public boolean buscarDatos(String data){
        boolean encontrado=false;
        Nodo aux=getCabeza();
            while (encontrado!=true && aux!=null) {
            if (data.equals(aux.datos)) {
                encontrado=true;
            }else{
                aux=aux.siguiente;
            }
            if (encontrado==true)break;
            }
            return encontrado;
        }
    public void mostrarvalor(){
        Nodo aux=getCabeza();
        String data;
        while (aux!=null) {
            data=(String) aux.verDato();
        }
    }
    public void llamarcategoria(String e){
        getCabeza().categoria.addInicio(e);
    }
    public boolean state(){
     return getCabeza()==null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
}
