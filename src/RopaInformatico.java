public class RopaInformatico extends Outfit {

    public RopaInformatico() {
        this.descripcion = "Vestuario Informático cómodo, para trabajar remoto";
    }

    @Override
    public void aplicar() {
        System.out.println("Se ha equipado el pijama.");
    }
}