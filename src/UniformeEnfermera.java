public class UniformeEnfermera extends Outfit {

    public UniformeEnfermera() {
        this.descripcion = "Uniforme Clinico anti-derrame";
    }

    @Override
    public void aplicar() {
        System.out.println("Se ha equipado el uniforme de enfermera anti-derrame.");
    }
}