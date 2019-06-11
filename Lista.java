public class Lista {
    // Referencia  a el node raiz o la cabeza de la lista.
    private Nodo head;
    private int tamanio;
 
    // constructor
    public Lista() {
        this.head = null;
        this.tamanio = 0;
    }
    public boolean listaVacia(){
        return head == null;
    }
     // Agrega el nodo al final de la lista.
    public void add(int dato){
        System.out.println("hola");
        Nodo nuevo = new Nodo(dato);
        if(head == null){
            head = nuevo;
        }else{
            Nodo aux = head;
            while(aux.getEnlace() != null ){
                aux = aux.getEnlace();
            }
            aux.setEnlace(nuevo);
            System.out.println("me agregue");
            this.tamanio ++;
        }
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
 