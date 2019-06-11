import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Lista sList = new Lista();
        Scanner teclado = new Scanner(System.in);

        int a;
        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.add(4);
        sList.add(5);
        // do{
        //     System.out.println("Ingresa un numero: ");
        //     sList.add(teclado.nextInt());
            

        //     System.out.println("1.- Agregar otro numero\n2.- Salir");
        //     a = teclado.nextInt();    
        // }while(a != 2);
 
        System.out.println("---------------------------------");
        sList.listar();
		
    }
}