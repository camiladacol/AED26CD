package uy.edu.curso.UT0ej4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n1 = new Scanner(System.in); // Se define el scanner con el nombre n1

        System.out.println("Ingrese un valor: "); // Se muestra por consola "Ingrese un valor: "
        int numero = n1.nextInt(); // Se define numero como entero y se asigna el valor leido por el scanner n1

        System.out.println("Factorial: " + UtilMath.factorial(numero) );

        if (UtilMath.isPrime(numero))
        {
            System.out.println("El numero es primo");
            System.out.println("Suma de pares: " + UtilMath.sumaPares(numero));

        }
        else
        {
            System.out.println("El numero no es primo");
            System.out.println("Suma de impares: " + UtilMath.sumaImpares(numero));
        }
    }
}