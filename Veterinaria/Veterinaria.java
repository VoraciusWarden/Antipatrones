package Veterinaria;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private List<Animal> animals;

    public Veterinaria(String nombre) {
        this.nombre = nombre;
        this.animals = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        this.animals.add(animal);
    }
    public void mostrarAnimales(){
        for(Animal animal : animals){
            animal.mostrarInfoBasica();
        }
    }
    public void tratarAnimales(){
        for(Animal animal : animals){
            animal.tratarAnimal();
        }
    }
}
