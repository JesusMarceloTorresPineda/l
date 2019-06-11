import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Lista sList = new Lista();
        Scanner teclado = new Scanner(System.in);

        int a;
        
        do{
            System.out.println("Ingresa un numero: ");
            sList.add(teclado.nextInt());
            

            System.out.println("1.- Agregar otro numero\n2.- Salir");
            a = teclado.nextInt();    
        }while(a != 2);
 
        System.out.println("---------------------------------");
        sList.listar();
		
    }
}