package cosicas;

import java.util.ArrayList;

/**
 * Restaurante con los platos y la carta 
 * 
 * @author Eva Royo
 *
 */
public class Restaurante {


	private String nombre;
	private ArrayList<Plato> carta = new ArrayList<Plato>();
	private ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
	
	/**
	 * Crea un restaurante con el nombre indicado. La list de platos y la carta est�n vac�os.
	 * @param nombre El nombre
	 */
	public Restaurante(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * A�ade un plato a la lista de platos del restaurante
	 * @param plato el plato a a�adir
	 * @return verdad si se ha modificado el arraylist correctamente
	 */
	public boolean agnadePlatoLista (Plato plato) {
		if (listaPlatos.contains(plato)) {
			return false;
		}
		return listaPlatos.add(plato);
	}

	/**
	 * A�ade un plato a la lista de la carta del restaurante
	 * @param plato {@link Plato} a a�adir en la carta del restaurante
	 * @return verdad si se ha modificado el arraylist correctamente
	 */
	public boolean agnadePlatoCarta (Plato plato) {
		if (carta.contains(plato)) {
			return false;
		}
		return carta.add(plato);
	}

	/**
	 * Retira un plato de la lista de platos del restaurante
	 * @param plato {@link Plato} que se va a eliminar de la lista del restaurante
	 * @return verdad si el plato est� en la lista y se ha borrado
	 */
	public boolean retiraPlatoLista (Plato plato) {
		return listaPlatos.remove(plato);
	}

	/**
	 * Retira un plato de la lista del menu del restaurante
	 * @param plato {@link Plato} que se va a retirar de la carta del restaurante
	 * @return verdad si el plato est� en la carta y se ha borrado
	 */
	public boolean retiraPlatoCarta (Plato plato) {
		return carta.remove(plato);
	}

	/**
	 * Devuelve el nombre del restaurante
	 * @return El nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre El nombre del restaurante
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener la carta del restaurante
	 * @return La carta del restaurante en un {@link ArrayList}
	 */
	public ArrayList<Plato> getCarta() {
		return carta;
	}

	/**
	 * Asigna una carta nueva al restaurante
	 * @param carta la carta a asignar
	 */
	public void setCarta(ArrayList<Plato> carta) {
		this.carta = carta;
	}

	/**
	 * Devuelve el {@link ArrayList} con los platos del restaurante
	 * @return la listaPlatos
	 */
	public ArrayList<Plato> getListaPlatos() {
		return listaPlatos;
	}

	/**
	 * Asigna una lista lista de platos a la lista del restaunte
	 * @param listaPlatos la listaPlatos a asignar
	 */
	public void setListaPlatos(ArrayList<Plato> listaPlatos) {
		this.listaPlatos = listaPlatos;
	}

}
