package zooAnimales;
import gestion.Zona;

public class Animal {

    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){}

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        return  "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + 
        "Aves: " + Ave.cantidadAves() + "\n" + 
        "Reptiles: " + Reptil.cantidadReptiles() + "\n" + 
        "Peces: " + Pez.cantidadPeces() + "\n" + 
        "Anfibios: " + Anfibio.cantidadAnfibios();
    }

    public String toString(){
        if(zona != null){
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el " + zona.getZoo();
        }
        else{
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero;
        }
    }
    
    // Metodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    // Metodos get
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getTotalAnimales(){
        return totalAnimales;
    }
}
