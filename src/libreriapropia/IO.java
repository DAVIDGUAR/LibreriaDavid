package libreriapropia;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class IO {

    

    final public int Introducir(int numero, String mensaje) {

        System.out.println("1-> consola\n 2-> ventana");
        int resultado = 0;

        switch (numero) {
            case 1:
                System.out.println("consola");
                Scanner ler = new Scanner(System.in);
                int num = ler.nextInt();
                String aux = JOptionPane.showInputDialog(mensaje);
                resultado = Integer.parseInt(aux);
                break;
            case 2:
                System.out.println("ventana");
                break;
            default:
                System.out.println("opcion non valida");
        }
        return resultado;
    }
}
