UT0 - Ejercicio 2: Operadores, expresiones y conversiones básicas
-
**Punto 1:** Revisar el programa ArithmeticDemo e indicar en qué líneas conviene reemplazar asignaciones simples por asignaciones compuestas. 

Desde la línea número 7 hasta a número 11 conviene remplazar las asignaciones simples por compuestas.
Se sustituye:

| Código inicial      | Conversión  |
|---------------------|-------------|
| result = result - 1 | result -= 1 |
| result = result + 2 | result += 2 |
| result = result * 2 | result *= 2 |
| result = result / 8 | result /= 8 |
| result = result % 7 | result %= 7 |

**Punto 2:** Agregar una variante que reciba dos valores por línea de comandos, los convierta a números y realice operaciones básicas.

int a e int i los define como enteros y se inicializa con valores 5 y 3 respectivamente. Luego le suma i + 1 al valor a que es 5, por lo que a termina siendo 9

**Punto 3:** Explicación escrita del orden de evaluación.

`int result = 1 + 2`

* Se realiza la suma 1 + 2
* El resultado da 3
* Se le asigna a result el valor 3

