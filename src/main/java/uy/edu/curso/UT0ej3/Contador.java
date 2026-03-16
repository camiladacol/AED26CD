package uy.edu.curso.UT0ej3;

public class Contador {

    final int MAX_CONT = 10; // El final se usa para indicar que algo no puede modificarse.
    int sube = 1; // Define de cuánto en cuánto aumenta el contador. De uno en uno
    int contador = 0;

    // Contador con WHILE
    public void WhileContador() //Método
    {
        contador = 0; // Se reinicia el contador para empezar desde 0.

        while (contador <= MAX_CONT) // Mientras contador sea menor o igual a MAX_CONT
        {
            System.out.println("While: " + contador); // Imprime el valor actual.
            contador += sube;
        }
    }
    // Contador con DO WHILE
    public  void DoWhileContador() {
        contador = 0;
        do // Ejecuta primero el código
        {
            System.out.println("DoWhile: " + contador); // Primero imprime y despues incrementa.
            contador += sube;
        }
        while (contador <= MAX_CONT); // Después se verifica la condición.
    }
}