package cl.praxis;

public class MiniBus extends Bus{
    private String tipoDeViaje;

    public MiniBus() {
    }

    public MiniBus(String tipoDeViaje) {
        this.tipoDeViaje = tipoDeViaje;
    }

    public MiniBus(int cantidadDeAsientos, String tipoDeViaje) {
        super(cantidadDeAsientos);
        this.tipoDeViaje = tipoDeViaje;
    }

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoDeViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoDeViaje = tipoDeViaje;
    }

    public String getTipoDeViaje() {
        return tipoDeViaje;
    }

    public void setTipoDeViaje(String tipoDeViaje) {
        this.tipoDeViaje = tipoDeViaje;
    }
    public void imprimeBus(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bus{" +
                "tipo de viaje=" + getTipoDeViaje() +
                "color=" + getColor() +
                "patentes=" + getPatente() +
                '}';
    }
}
