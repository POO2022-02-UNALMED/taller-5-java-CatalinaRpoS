package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
    	super();
    	listado.add(this); // Agrego el animal
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
    	super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;

        listado.add(this); // Agrego el animal
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanca", 1);
    }

    // Metodos set
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

    // Metodos get
    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public int getLargoCola(){
        return this.largoCola;
    }
    
}