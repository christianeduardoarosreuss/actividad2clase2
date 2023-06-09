	package app;
	
	import static org.junit.Assert.assertEquals;
	
	import org.junit.Before;
	import org.junit.Test;
	
	public class CarritoTest {
	// el sujeto de prueba
		
		private Carrito carrito;
		private Producto producto1;
		private Producto producto2;
		
		// COnfiguración inicial antes de cada @test (Método prueba)
	
		
		@Before
		
		public void setUp() {
			
			carrito = new Carrito();
			producto1 = new Producto("Monitor Gamer ASUS", 250000);
			producto2 = new Producto("Mouse Razer", 65000);
			
			carrito.agregarProducto(producto1);
					
		}
		
		@Test
		
		public void testAgregarProducto() {
			
			//assertequals(expect, currentValue)
			assertEquals(1, carrito.getProductos().size());
			//agregar 2º prod
			carrito.agregarProducto(producto2);
			assertEquals(2, carrito.getProductos().size());
			
		}
		
		@Test
		
		public void testEliminarProducto() {
			
			carrito.eliminarProducto(producto1);
			// verfiicar que la cantidad de poructos sea la correcta
			assertEquals(0,carrito.getProductos().size());
		}
		
		@Test
		
		public void testCalcularTotal() {
			
			double total = carrito.calcularTotal();
			assertEquals(250000, total, 0.0);
		}
	}
