import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestorPedidosTest {
    GestorPedidos gestor;


    @Before
    public void setUp() {
        this.gestor = new GestorPedidosImp();
        gestor.addProducto("CocaCola",2.3);
        gestor.addProducto("Barra Choco", 1.2);
        gestor.addProducto("Chapata",3.5);

        gestor.addUser("Toni","Garcia");
        gestor.addUser("Marc","Vila");
        gestor.addUser("Marina","Pujol");

    }

    @Test
    public void testEncolarPedido() throws QueueFullException {
        Pedido p = new Pedido ("Toni");
        p.addLP(3, "CocaCola");
        p.addLP(1, "Barra Choco");
        p.addLP(1, "Chapata");

        gestor.encolarPedido(p);

        int i = 0;
    }


}
