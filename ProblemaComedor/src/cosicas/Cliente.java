package cosicas;

import java.util.ArrayList;

/**
 * Clase para representar a los clientes del restaurante
 * @author Eva Royo
 *
 */
public class Cliente {

	private ArrayList<Plato> menu;
	private int numeroMesa = 0;
	private int gasto = 0;
	
	/**
	 * Crea un cliente asign�ndole ya un men�, y un n�mero de mesa. El precio del men� se carga autom�ticamente 
	 * @param menu {@link ArrayList} con el men� elegido
	 * @param numeroMesa n�mero de mesa en el que est� sentado
	 */
	public Cliente(ArrayList<Plato> menu, int numeroMesa) {
		this.menu = menu;
		this.numeroMesa = numeroMesa;
		if (menu != null) {
			for (Plato plato : menu) {
				gasto = gasto + plato.getPrecio();
			}
		}
	}
	
	/**
	 * Crea un cliente a partir de su n�mero de mesa, sin men� ni gasto asociado.
	 * @param numeroMesa N�mero de mesa donde est� el cliente
	 */
	public Cliente(int numeroMesa) {
		this.numeroMesa = numeroMesa;
		this.menu = new ArrayList<Plato>();
	}

	/**
	 * A�ade un plato al men� del cliente, calcula el gasto. S�lo permite asingar 2 platos por cliente
	 * @param plato {@link Plato} que se a�ade al men� del cliente
	 * @return verdad si se ha podido a�adir el plato al menu, falso si ya lo  hab�a pedido o intenta pedir m�s de 2
	 */
	public boolean agnadePlato(Plato plato) {
		if (menu.contains(plato) || menu.size() >= 2) {
			return false;
		}
		gasto = gasto + plato.getPrecio();
		return menu.add(plato);
	}
	
	/**
	 * Retira un plato al men� del cliente
	 * @param plato {@link Plato} que se retira del men�
	 * @return verdad si se ha podido retirar el plato al menu, falso en otro caso
	 */
	public boolean retiraPlato(Plato plato) {
		if (menu.remove(plato)) {
			gasto = gasto - plato.getPrecio();
			return true;
		}
		return false;
	}

	/**
	 * Devuelve el n�mero de mesa en el que est� el cliente
	 * @return el n�mero de mesa
	 */
	public int getNumeroMesa() {
		return numeroMesa;
	}

	/**
	 * Asigna un nuevo n�mero de mesa al cliente
	 * @param numeroMesa el numero de mesa
	 */
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	/**
	 * {@link ArrayList} con los platos del men� del cliente
	 * @return el menu
	 */
	public ArrayList<Plato> getMenu() {
		return menu;
	}

	/**
	 * Asigna un nuevo men� al cliente
	 * @param menu el men�
	 */
	public void setMenu(ArrayList<Plato> menu) {
		this.menu = menu;
	}

	/**
	 * Obtiene el gasto del men� del cliente.
	 * @return the gasto
	 */
	public int getGasto() {
		return gasto;
	}

	/**
	 * Asinga un nuevo gasto al cliente
	 * @param gasto el gasto del cliente
	 */
	public void setGasto(int gasto) {
		this.gasto = gasto;
	}


	/**
	 * Imprime la informaci�n del men� elegido del cliente, su nombre y lo que tiene que pagar
	 */
	@Override
	public String toString() {
		if (menu.size() >= 2) {
			return ("Primer plato =" + menu.get(0).getNombre() + "; Segundo plato =" + menu.get(1).getNombre() + " servido en la mesa " + numeroMesa +
				"\nA PAGAR=" + this.gasto);
		} else {
			return ("Primer plato =" + menu.get(0).getNombre() + "; servido en la mesa " + numeroMesa +
					"\nA PAGAR=" + this.gasto);
		}
			
	}

}
