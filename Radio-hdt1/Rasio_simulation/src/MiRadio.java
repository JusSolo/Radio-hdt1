public class MiRadio implements Radio{

    private boolean encendido;
    private boolean banda;
    private Float frecuencia;

    public MiRadio() {
        this.encendido = false;
    }


    /**
     *
     */
    @Override
    public void encender() {
        this.encendido = true;
    }

    /**
     *
     */
    @Override
    public void apagar() {
        this.encendido = false;
    }

    /**
     * @param i
     */
    @Override
    public void setVolume(int i) {

    }

    /**
     * @param banda
     */
    @Override
    public void cambiarBanda(int banda) {

    }

    /**
     *
     */
    @Override
    public void subirEmisora() {

    }

    /**
     *
     */
    @Override
    public void bajarEmisora() {

    }

    /**
     * @param i
     * @param frec
     */
    @Override
    public void guardarEmisora(int i, float frec) {

    }

    /**
     * @param i
     */
    @Override
    public void seleccionarEmisora(int i) {

    }
}
