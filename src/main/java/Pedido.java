import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class Pedido {
    String usuario;
    LinkedList<Producto> listaProductos; //Productos dentro del pedido
    LinkedList<Integer> cantidadxproducto;
    double precioT;

    public double getPrecioT() {
        return precioT;
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void crearPedido(String nombre, Producto p,int numerop){

        this.precioT = 0;
        this.usuario = nombre;
        listaProductos.add(p);
        int i = numerop;
        double precio_2 = 0;
        while (i > 0){
            p.venta();
            precio_2 = precio_2 + p.getPrecio();
            i--;
        }
        cantidadxproducto.add(numerop);
        this.precioT = this.precioT + precio_2;
    }

    public void añadiraPedido(Producto p, int numerop){
        listaProductos.add(p);
        cantidadxproducto.add(numerop);
        double precio_2 = 0;
        int i = numerop;
        while (i > 0){
            p.venta();
            precio_2 = precio_2 + p.getPrecio();
            i--;
        }
        this.precioT = this.precioT + precio_2;
    }
}
