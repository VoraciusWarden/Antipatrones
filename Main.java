import Veterinaria.*;
public class Main {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria("El Perro Feliz");
        
        veterinaria.agregarAnimal(new Perro("Firulais", "Café", "Croquetas"));
        veterinaria.agregarAnimal(new Perro("Max", "Negro", "Pollo"));

        veterinaria.mostrarAnimales();
        veterinaria.tratarAnimales();
        veterinaria.mostrarAnimales();
    }
}