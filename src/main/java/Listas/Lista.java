package Listas;

public class Lista
{
    //Declara variable del primer nodo
    public Nodo primero;
    public Lista()
    {
        primero = null;
    }

    private String leerEntero()
    {
        System.out.println("Ingrese espacio en blanco para terminar");
        return (new java.util.Scanner(System.in).nextLine());
    }

    public Lista crearLista()
    {
        String nombre;
        primero = null;
        do{
            nombre = leerEntero();
            if(nombre!="")
            {
                primero = new Nodo(nombre,primero);
            }
        }while(nombre!="");
        return this;

    }

    public Lista insertarCabezaLista(String entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar()
    {
        Nodo n;
        int k = 0;
        n = primero;
        while(n!=null)
        {
            System.out.println(n.dato + " ");
            n = n.enlace;
            k++;
            //Cada 15 elementos imprime un salto de linea
            System.out.println((k%15!=0?" ":"\n"));
        }
    }
}