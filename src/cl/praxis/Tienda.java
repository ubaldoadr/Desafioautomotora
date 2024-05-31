package cl.praxis;

public class Tienda {
    private int stock;
    private Vendedor vendedor;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Tienda() {
    }

    public Tienda(int stock, Vendedor vendedor, Cliente cliente, Vehiculo vehiculo) {
        this.stock = stock;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    void existeStock(){
        System.out.println("En el sistema figuran: " + getStock());
    }
    }
