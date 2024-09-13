public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.mostrarComponentes();
        robot.realizarAcciones();

        Outfit uniformeEnfermera = new UniformeEnfermera();
        Outfit ropaInformatico = new RopaInformatico();

        robot.aplicarOutfit(uniformeEnfermera);
        robot.aplicarOutfit(ropaInformatico);
    }
}