package uy.edu.curso.UT0ej2;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2; // suma de dos enteros
        result -= 1; // le resta 1 a result
        result *= 2; // result se multiplica por 2
        result /= 2; // result se divide entre 2
        result += 8; // le suma 8 a result
        result %= 7; // Asignacion de mod, calcula el resto de dividir result entre 7
        int a = 5;
        int i = 3;
        a += ++i;

        System.out.println(result); // Se muestra por consola el valor de result

        Scanner n1 = new Scanner(System.in); // Se define el scanner con el nombre n1
        Scanner n2 = new Scanner(System.in); // Se define el scanner con el nombre n2

        System.out.println("Ingrese un valor: "); // Se muestra por consola "Ingrese un valor: "
        int numero = n1.nextInt(); // Se define numero como entero y se asigna el valor leido por el scanner n1

        System.out.println("Ingrese otro valor: "); // Se muestra por consola "Ingrese otro valor: "
        int numero2 = n2.nextInt(); // Se define numero2 como entero y se asigna el valor leido por el scanner n2

        System.out.println((numero + numero2)); // Se imprime la suma del numero 1 y numero 2
        System.out.println((numero - numero2)); // Se imprime la resta del numero 1 y numero 2
        System.out.println((numero * numero2)); // Se imprime la multiplicación del numero 1 y numero 2
        System.out.println((numero / numero2)); // Se imprime la divición del numero 1 y numero 2
        System.out.println((numero % numero2)); // Se imprime el resto del numero 1 y numero 2

    }
}

