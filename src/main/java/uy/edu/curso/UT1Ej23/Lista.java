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
        if (primeroEnLista == null)
        {
            primeroEnLista = nuevo;
        }
    }
    //else
    {
        Nodo<T> actual = primeroEnLista;
        while (actual.getSiguiente() != null)
        {
            actual = actual.getSiguiente();
        }
        primeroEnLista = actual.getSiguiente();
    }

    public boolean sacar (T valor)
    {
        if  (primeroEnLista == null)
        {
            return false;
        }
        if (primeroEnLista.getValor().equals(valor));
        return true;
    }
}
