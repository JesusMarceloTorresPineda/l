public class Nodo {
    //Referencia al siguiente elemento o a NULL si es el ultimo
    private Nodo enlace;
    private int dato;
    private int valor;
    // Nodo constructor
    public Nodo(int dato) {
        enlace = null;
        this.dato = dato;
    }
    // Constructor que incluye el siguiente nodo
    public Nodo(int valor, Nodo referencia) {
        enlace = referencia;
        dato = valor;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getEnlace(){
        return enlace;
    }

    public void setEnlace(Nodo referencia){
        this.enlace = referencia;
    }
}
