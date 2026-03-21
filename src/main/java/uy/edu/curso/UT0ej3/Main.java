package uy.edu.curso.UT0ej3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in); // Se define el scanner con el nombre n1
        Contador contador = new Contador();

        System.out.println("Elegir tipo:"); //Imprimer en pantalla "Elegir tipo"
        System.out.println("1 - While");
        System.out.println("2 - Do While");
        System.out.println("3 - For");

        int opcion = n1.nextInt();
        switch (opcion)
        {
            case 1:
                contador.WhileContador();
                break;
            case 2:
                contador.DoWhileContador();
                break;
            case 3:
                contador.ForContador();
            default:
                System.out.println("Opcion incorrecta");
        }

    }
}
