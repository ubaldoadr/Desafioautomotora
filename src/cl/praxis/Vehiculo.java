package cl.praxis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vehiculo {
    private String color;
    private String patente;

    public Vehiculo() {
    }

    public Vehiculo(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean existePatente(String patente, String nombreVenta){
        File directorio = new File("src/ficheros");

        if (!directorio.exists()) {
           return false;
        }

        File Fichero = new File(directorio.getAbsoluteFile() + "/" + nombreVenta+ ".txt");
        if (!Fichero.exists()) {
            return false;
        }
        try {
            FileReader fr = new FileReader(Fichero);
            BufferedReader br = new BufferedReader(fr);
            boolean comprobar = false;
            String data;
            boolean cualquiera= false;
            while ((data = br.readLine()) != null) {
                String[] verificar = data.split(" ");
                if (patente.equalsIgnoreCase(verificar[1])){
                    cualquiera= true;

                }
            }
            fr.close();
            br.close();
           return cualquiera;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
