package Veterinaria;
import java.util.Random;

public abstract class Animal {
    
    public enum Padecimientos {
        GRIPE, FRACTURA, INFECCION, OTRO
    }

    protected String nombre, colorPelaje, comidaFavorita;
    protected Padecimientos padecimiento;

    public abstract void tratarAnimal();

    Animal(String nombre, String colorPelaje, String comidaFavorita) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.comidaFavorita = comidaFavorita;
        asignarPadecimientoAleatorio();
    }
    
    public void mostrarInfoBasica() {

        System.out.println("\nNombre: " + nombre);
        System.out.println("Color de Pelaje: " + colorPelaje);
        System.out.println("Comida Favorita: " + comidaFavorita);
        System.out.println("El animal presenta el siguiente padecimiento: " + padecimiento + "\n" );
    }


    public void asignarPadecimientoAleatorio() {
        Random random = new Random();
        Padecimientos[] valores = Padecimientos.values();
        this.padecimiento = valores[random.nextInt(valores.length)];
    }

}
