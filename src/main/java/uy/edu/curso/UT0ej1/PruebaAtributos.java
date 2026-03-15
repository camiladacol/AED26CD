package uy.edu.curso.UT0ej1;

public class PruebaAtributos {
    public static void main(String[] args) {

        int edad = 20;
        boolean correcto = true;
        double coma = 3.2;
        char letra = 'C';
        String texto = "Hola";

        //int error = "hola";
        //error: Incompatible types. Found: 'java.lang.String', required: 'int'
        //boolean error = 1;
        //error: Incompatible types. Found: 'int', required: 'boolean'
        //double coma = "b";
        //error: Incompatible types. Found: 'java.lang.String', required: 'double'
        //char error = 'aasd';
        //error: java: unclosed character literal
        //*String error = hola;
        //error: cannot find symbol variable hola

        System.out.println("Mi edad es " + edad);
        System.out.println("¿Estoy cursando AED en 2026? " + correcto);
        System.out.println("Un número con decimal es: " + coma);
        System.out.println("Mi nombre inicia con la letra: " + letra);
        System.out.println("Para saludar a alguien le digo: " + texto);

        /*
        int numero;
        System.out.println(numero);
        Error: Variable 'numero' might not have been initialized
        */


    }


    //PARA COMPILAR: mvn clean compile exec:java -Dexec.mainClass="org.ejercicio1.PruebaAtributos" //command prompt
    //clean para hacer una compliación limpia (borrar las anteriores)
    //compile para compilar
    //exec:java para ejecutar
    //-Dexec.mainClass="Ruta de la clase"


    //De ejemplos primitivos utilizamos int, boolean, double, char y float. Lo que tuvimos que hacer es darle un valor directo.
    // Los de referencia son tratados como objeto.

    //mvn clean compile exec:java -Dexec.mainClass="uy.edu.curso.UT0ej1.PruebaAtributos"
}
