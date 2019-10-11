import java.util.List;

public interface GestorPedidos {
    public List<Producto> productosordenadosPrecio();
    public void realizarPedido(Pedido c);
    public void servirPedido();
    public List<Pedido> pedidosUsuario(String iduser);
    public List<Producto> productosordenadosventas();
}
