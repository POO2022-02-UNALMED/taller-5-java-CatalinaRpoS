package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        int total = 0;
        for (Zona zona : zonas) {
            total += zona.getAnimales().size();
          }
        return total;
    }

    // Metodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    // Metodos get
    public String getNombre(){
        return this.nombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }

    public ArrayList<Zona> getZona(){
        return zonas;
    }
}
