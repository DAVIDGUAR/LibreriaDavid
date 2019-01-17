package libreriapropia;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class IO {
    
    int numero;
    
    
   
    
  final public int Introducir(int numero,String mensaje){               

        
        System.out.println("1-> consola\n 2-> ventana");
    
            Scanner ler = new Scanner (System.in);
            int num = ler.nextInt();
            
            switch(numero){
            case 1: System.out.println("consola");
            break;
            case 2: System.out.println("ventana");
            break;
            default:System.out.println("opcion non valida");
}
}
}

