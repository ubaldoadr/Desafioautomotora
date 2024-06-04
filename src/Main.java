import cl.praxis.Cliente;
import cl.praxis.LibroVenta;
import cl.praxis.Vehiculo;

public class Main {
    public static void main(String[] args) {

        LibroVenta prueba= new LibroVenta("aaa", "1111");

        prueba.guardarVenta(new Cliente("111111", "luis" , 22), new Vehiculo("rojo", "323232"));
        prueba.guardarVenta(new Cliente("222222", "ana", 30), new Vehiculo("azul", "333333"));
        prueba.guardarVenta(new Cliente("333333", "mina", 20), new Vehiculo("verde", "444444"));


    }


}