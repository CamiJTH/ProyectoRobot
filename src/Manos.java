public class Manos {
    private int dedos;
    private String fuerza;

    public Manos() {
        this.dedos = 5;
        this.fuerza = "de Enfermera en pandemia";
    }

    public void agarrarObjeto() {
        System.out.println("La mano está agarrando un objeto.");
    }

    public void mostrarInfo() {
        System.out.println("Dedos: " + dedos + ", Fuerza: " + fuerza);
    }
}
