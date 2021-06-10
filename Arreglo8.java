import java.util.*;

public class Arreglo8 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio;
        String Respuesta;

        do {

            do {

                numeroAleatorio = (byte)Math.floor(Math.random()*100+1);

                if (numeroAleatorio % 5 == 0) {
                    System.out.println("El numero generado es: "+numeroAleatorio);
                }  

            } while (numeroAleatorio % 5 == 0);

            System.out.println("Desea escribir otro numero? Salir(S) Continuar(C)");
            Respuesta = teclado.nextLine();

        } while (!"S".equalsIgnoreCase(Respuesta));
    }
}