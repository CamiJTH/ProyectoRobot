
public class Robot {
    private Manos manos;
    private Piernas piernas;
    private Torso torso;
    private Cabeza cabeza;

    public Robot() {
        this.manos = new Manos();
        this.piernas = new Piernas();
        this.torso = new Torso();
        this.cabeza = new Cabeza();
    }

    public void mostrarComponentes() {
        System.out.println("Información del Robot:");
        manos.mostrarInfo();
        piernas.mostrarInfo();
        torso.mostrarInfo();
        cabeza.mostrarInfo();
    }

    public void realizarAcciones() {
        manos.agarrarObjeto();
        piernas.caminar();
        torso.protegerFuentePoder();
        cabeza.aprender();
    }

    // Método para aplicar un outfit al robot
    public void aplicarOutfit(Outfit outfit) {
        System.out.println("Aplicando outfit: " + outfit.getDescripcion());
        outfit.aplicar();
    }
}
