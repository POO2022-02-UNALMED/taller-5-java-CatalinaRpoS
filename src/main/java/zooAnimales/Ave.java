package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){}

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPlumas = colorPlumas;

        listado.add(this); // Agrego el animal
    }

    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }

    // Metodos set
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }

    // Metodos get
    public String getColorPlumas(){
        return this.colorPlumas;
    }
}
