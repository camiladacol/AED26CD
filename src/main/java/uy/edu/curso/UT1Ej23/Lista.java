package uy.edu.curso.UT1Ej23;

public class Lista<T>
{
    private Nodo<T> primeroEnLista;

    public Lista()
    {
        this.primeroEnLista = null;
    }

    public void agregar(T valor)
    {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (primeroEnLista == null) {
            primeroEnLista = nuevo;
        }
        else
        {
            Nodo<T> actual = primeroEnLista;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public boolean sacar (T valor) // Saca un elemento y devuelve true si lo sacó
    {
        if  (primeroEnLista == null)
        {
            return false;
        }
        if (primeroEnLista.getValor().equals(valor));
        {
         primeroEnLista = primeroEnLista.getSiguiente();
         return true;
        }
    }

    public boolean buscar (T valor) // Busca un elemento, si existe devuelve true
    {
        Nodo<T> actual = primeroEnLista;
        while (actual != null) {
            if (actual.getValor().equals(valor))
            {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int cantidad() // Devuelve la cantidad de elementos
    {
        int contador = 0;
        Nodo<T> actual = primeroEnLista;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
}
