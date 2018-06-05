package biblioteca;

import java.util.Scanner;

public class Autor {
    
    String Nombre;
    String Pais;
    
    public void DatosAutor()
    {
        System.out.println("INGRESE LOS DATOS DEL AUTOR");
        
        System.out.println("Nombre:");
        Scanner LeerNombre = new Scanner(System.in);
        Nombre = LeerNombre.nextLine();
        
        System.out.println("País:");
        Scanner LeerPais = new Scanner(System.in);
        Pais = LeerPais.nextLine();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
}
