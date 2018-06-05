package biblioteca;

import java.util.Scanner;

public class Biblioteca 
{
    
    public static void main(String[] args) 
    {
        
        String Opcion;
        String Sopcion;
        int Cont=0;
        
        Libro libro = new Libro();
        
        System.out.println("***BIBLIOTECA***");
        System.out.println("A)Ingresar nuevo libro");
        System.out.println("B)Libros Favoritos");
        System.out.println("C)Libros por autor");
        System.out.println("S)Salir");
        
        System.out.println("Ingrese la opcion deseada:");
        Scanner ingreso = new Scanner(System.in);
        Opcion = ingreso.nextLine();
        
        do{
            switch(Opcion)
            {
            case "A":
                if(Cont<=2)
                {
                    Cont=libro.IngresarLibro(Cont);
                }else{
                    System.out.println("Biblioteca llena, solo puede ingresar 10 libros");
                    System.out.println("¿Desea Salir? si/no");
                    Scanner LeerSubopcion = new Scanner(System.in);
                    Sopcion = LeerSubopcion.nextLine();
                    Opcion="S";
                }
                break;
            case "B":
                System.out.println(libro.toString());
                break;
            case "C":
                break;
            case "S":
                System.out.println("Adios :)");
                break;
            default:
                System.out.println("¡Opción incorrecta!");
                break;
            }
          }while(Opcion!="S"); 
    }
    
}
    

