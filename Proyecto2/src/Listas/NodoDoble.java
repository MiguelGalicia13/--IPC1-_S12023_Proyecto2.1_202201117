
package Listas;

public class NodoDoble {
    public NodoDoble siguiente, anterior;
    public Object datos;
    public ListaImagenes imagenes = new ListaImagenes();
    //constructor para cuando ya hay nodos
    public NodoDoble(Object dato, NodoDoble sig, NodoDoble ant){
        datos = dato;
        siguiente=sig;
        anterior=ant;
    }
    //para cuando aun no hay nodos
    public NodoDoble(Object dato){
        this(dato, null, null);
    }
}
