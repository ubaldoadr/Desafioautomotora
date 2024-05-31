package cl.praxis;

public class Taxi extends Vehiculo{
    private int valorPasaje;

    public Taxi() {
    }

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    void pagarPasaje(){
        System.out.println("se recibio el pasaje: " + getValorPasaje());
    }

}
