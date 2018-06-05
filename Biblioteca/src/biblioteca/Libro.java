package biblioteca;

import java.util.Scanner;


public class Libro 
{
    String Titulo;
    Autor autor = new Autor();
    int Año;
    boolean Favorito;
    
    public int IngresarLibro(int cont)
    {
        
        System.out.println("INGRESE LOS DATOS DEL LIBRO");
        
        System.out.println("Título:");
        Scanner LeerTitulo = new Scanner(System.in);
        Titulo = LeerTitulo.nextLine();
        
        System.out.println("Autor:");
        autor.DatosAutor();
        
        System.out.println("Año:");
        Scanner LeerAño = new Scanner(System.in);
        Año = LeerAño.nextInt();
        
        System.out.println("Favorito:");
        Scanner LeerFavorito = new Scanner(System.in);
        Favorito = LeerTitulo.nextBoolean();
        
        return cont++;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(boolean Favorito) {
        this.Favorito = Favorito;
    }
 
}
