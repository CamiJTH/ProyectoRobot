public class Torso {
    private String material;
    private String resistencia;

    public Torso() {
        this.material = "Aluminio";
        this.resistencia = "Alta";
    }

    public void protegerFuentePoder() {
        System.out.println("El torso está protegiendo la fuente de poder del robot.");
    }

    public void mostrarInfo() {
        System.out.println("Material del cuerpo del robot: " + material + ", Resistencia: " + resistencia);
    }
}
