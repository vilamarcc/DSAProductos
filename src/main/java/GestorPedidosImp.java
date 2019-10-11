import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class GestorPedidosImp implements GestorPedidos{
    List<Pedido> pedidosTotales;
    HashMap<String, LinkedList<Pedido>> historialPedidos = new HashMap<String, LinkedList<Pedido>>();

    public void realizarPedido(Pedido c){
        pedidosTotales.add(c);

        if(historialPedidos.get(c.getUsuario()) != null) {
           LinkedList<Pedido> pedidosprevios =  historialPedidos.get(c.getUsuario());
           pedidosprevios.add(c);
           historialPedidos.remove(c.getUsuario());
           historialPedidos.put(c.getUsuario(),pedidosprevios);
        }
        else if(historialPedidos.get(c.getUsuario()) == null){
            LinkedList<Pedido> pedidonuevo = new LinkedList<Pedido>();
            historialPedidos.put(c.getUsuario(),pedidonuevo);
        }
    }

    public List<Pedido> pedidosUsuario(String iduser){
        List<Pedido> pedidosuser =  historialPedidos.get(iduser);
        return pedidosuser;
    }

    public List<Producto> productosordenadosventas(){
        return null;
    }

    public void servirPedido(){

    }

    public List<Producto> productosordenadosPrecio(){
        return null;
    }
}
