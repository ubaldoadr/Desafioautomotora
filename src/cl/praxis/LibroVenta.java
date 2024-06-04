package cl.praxis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta() {
    }

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente , Vehiculo vehiculo){
        if (!(vehiculo.existePatente(vehiculo.getPatente(), nombreVenta))){

        File directorio = new File("src/ficheros");

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado exitosamente!");
            }
        }

        File Fichero = new File(directorio.getAbsoluteFile() + "/" + nombreVenta+ ".txt");
        try {
            if (Fichero.createNewFile()) {
                System.out.println("Archivo creado");
            }
            FileWriter fw = new FileWriter(Fichero, true);
            BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Patente: "+ vehiculo.getPatente() + " Edad: " + cliente.getEdad() +" Fecha de venta " + getFechaVenta() + " Nombre venta "+ getNombreVenta() + "\n");

            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("Error escribiendoArchivo");
            e.printStackTrace();

        }
        }else {
            System.out.println("La patente ya esta registrada");
        }
    }

}
