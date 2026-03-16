package uy.edu.curso.UT0ej4;

public class UtilMath {
    public static int factorial(int num)
    {
        if (num < 0) // Si el número es negativo, no se puede calcular el factorial
        {
            System.out.println("No existe factorial de negativo");
            return 0;
        }

        int resultado = 1; // Se inicializa la variable resultado en 1

        for (int i = 1; i <= num; i++) // Recorre desde 1 hasta num y va multiplicando
        {
            resultado *= i;
        }
        return resultado; // Devuelve el factorial calculado
    }

    // Ver si un número es primo
    public static boolean isPrime(long n) {

        if (n <= 1) { // Primero hay que verificar si es 1 o 0, que ya se sabe que esos no son primos
            return false;
        }

        for (int i = 2; i < n; i++) // Recorre desde 2 hasta n-1 para ver si tiene divisores
        {
            if (n % i == 0) // Si el resto da 0, el número tiene divisor y no es primo
            {
                return false;
            }
        }
        return true; // Si no encontró divisores, entonces sí es primo
    }

    // Suma de pares usando while
    public static int sumaPares(int n)
    {
        int suma = 0; // Guarda la suma
        int i = 0;

        while (i <= n)
        {
            if (i % 2 == 0) {
                suma += i;
            }
            i++; // Continua al siguiente
        }
        return suma; // Devuelve la suma total de pares
    }

    // Suma de impares usando while
    public static int sumaImpares(int n)
    {
        int suma = 0;
        int i = 0;

        while (i <= n)
        {
            if (i % 2 != 0)
            {
                suma += i;
            }
            i++;
        }
        return suma;
    }
}

