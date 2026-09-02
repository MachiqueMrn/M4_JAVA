public class AutoElectrico implements Recargable {
    private String modelo;

    public AutoElectrico(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void iniciarCarga() {
        System.out.println("Conectando cable de alta tensión... Cargando batería del auto " + modelo + ".");
    }
}
