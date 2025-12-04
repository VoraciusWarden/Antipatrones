package Veterinaria;

public class Perro extends Animal {
    
    public Perro(String nombre, String colorPelaje, String comidaFavorita) {
        super(nombre, colorPelaje, comidaFavorita);
    }

    @Override
    public void tratarAnimal() {
        switch (padecimiento) {
            case GRIPE:
                System.out.println("Tratando la gripe del perro con medicamentos y reposo.");
                break;
            case FRACTURA:
                System.out.println("Tratando la fractura del perro con inmovilización y cirugía si es necesario.");
                break;
            case INFECCION:
                System.out.println("Tratando la infección del perro con antibióticos.");
                break;
            default:
                System.out.println("Tratando el padecimiento del perro de manera general.");
                break;
        }
        asignarPadecimientoAleatorio();
        System.out.println("Se ha tratado al animal.");
    }

}
