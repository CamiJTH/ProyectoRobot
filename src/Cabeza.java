public class Cabeza {
    private String neuronasArtificiales;
    private String vision;

    public Cabeza() {
        this.neuronasArtificiales = "Inteligencia Artificial";
        this.vision = "Sensores de visión";
    }

    public void aprender() {
        System.out.println("El Robot está analizando y aprendiendo.");
    }

    public void mostrarInfo() {
        System.out.println("Neuronas: " + neuronasArtificiales + ", Visión: " + vision);
    }
}
