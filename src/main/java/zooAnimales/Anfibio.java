package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){}

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;

        listado.add(this); // Agrego el animal
    }
    
    public static int cantidadAnfibios(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    // Metodos set
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }

    // Metodos get
    public String getColorPiel(){
        return this.colorPiel;
    }

    public boolean isVenenoso(){
        return this.venenoso;
    }
}