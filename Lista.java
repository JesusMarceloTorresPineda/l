public class Lista {
    // Referencia  a el node raiz o la cabeza de la lista.
    private Nodo head;
    private int tamanio;
 
    // constructor
    public Lista() {
        head = null;
        tamanio = 0;
    }
    public boolean listaVacia(){
        return head == null;
    }
     // Agrega el nodo al final de la lista.
    public void add(int dato){
        Nodo nuevo = new Nodo(dato);
        Nodo aux = head;
        while (aux.getEnlace() != null) {
            aux = aux.getEnlace();
        }
        aux.setEnlace(nuevo);
        tamanio++;
    }
    public void listar(){
        if (!listaVacia()) {
            Nodo aux = head;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getDato() + " ]" + " ->  ");
                aux = aux.getEnlace();
                i++;
            }
        }
    }
 


}
 