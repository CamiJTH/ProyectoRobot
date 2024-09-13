public class Piernas {
    private int longitud;
    private String velocidad;

    public Piernas() {
        this.longitud = 95;
        this.velocidad = "Rápida";
    }

    public void caminar() {
        System.out.println("El robot está Corriendo como el viento.");
    }

    public void mostrarInfo() {
        System.out.println("Largo de piernas: " + longitud + " cm, Velocidad: " + velocidad);
    }
}
