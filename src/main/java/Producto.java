import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Producto {
    String ID;
    int numVentas;
    double precio;


    public double getPrecio() {
        return precio;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public String getID() {
        return ID;
    }

    //Constructor
    public Producto(String id, double pr){
        this.ID = id;
        this.numVentas = 0;
        this.precio = pr;
    }

    //Metodos

    public void updateVenta(int numVentas){
        this.numVentas+= numVentas;
    }

}
