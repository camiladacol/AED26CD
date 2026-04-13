package uy.edu.curso.UT1Ej20;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Main20
{
    public  static void main(String args[])
    {
        LinkedList<String> sucursales = new LinkedList();
        try
        {
            Scanner sc = new Scanner(new File("suc1.txt"));
            while (sc.hasNextLine())
            {
                sucursales.add(sc.nextLine());
            }
            System.out.println("Cantidad inicial" + sucursales.size());
        }
        catch (Exception e)
        {
            System.out.println("Error al abrir el archivo");
        }
    }
}
