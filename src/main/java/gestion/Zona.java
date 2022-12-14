package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona(){}

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

    // Metodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }

    // Metodos get
    public String getNombre(){
        return this.nombre;
    }

    public Zoologico getZoo(){
        return this.zoo;
    }

    public ArrayList<Animal> getAnimales(){
        return animales;
    }
}
