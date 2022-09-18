package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){}

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.pelaje = pelaje;
        this.patas = patas;

        listado.add(this); // Agrego el animal que se creó
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    // Métodos set
    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }

    // Métodos get
    public boolean isPelaje(){
        return this.pelaje;
    }

    public int getPatas(){
        return this.patas;
    }
}
