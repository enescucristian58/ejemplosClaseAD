package datos;

import java.util.Arrays;

/**
 * Clase para representar un vag�n del tren
 * Formado por un array y un n�mero.
 * Cada componente del array representa a un asiento del vag�n, si la componente
 * es 0 es porque no hay billete asignado a �l, sino contiene el n�mero el billete.
 * @author Eva Royo
 *
 */
public class Vagon {

	private int numero;
	/** contendr� el n�mero del billete que est� ocupando el asiento correspondiente */
	private int[] asientos;
	/** numero de asientos que tiene un vag�n **/
	final static int NUMASIENTOS = 3;
	
	
	/**
	 * Creo un vag�n el n�mero que se pasa como par�metro y preparo un array con
	 * los billetes que va a tener el vag�n.
	 * @param numero
	 */
	public Vagon(int numero) {
		super();
		this.numero = numero;
		this.asientos = new int[NUMASIENTOS];
		// inicializo los asientos a 0
		for (int i = 0; i < asientos.length; i++) {
			this.asientos[i] = 0;
		}
	}

	/**
	 * Asigna un billete al asiento que se especifica en el par�metro 
	 * @param numBillete El billete a asignar
	 * @param asiento El asiento al que corresponde el billete
	 * @return falso si el asiento ya estaba ocupado, verdad si se realiza bien la acci�n
	 */
	public boolean asignaBillete (int numBillete, int asiento) {
		if (this.asientos[asiento -1] != 0) {
			// el asiento ya est� ocupado
			return false;
		}
		this.asientos[asiento -1] = numBillete;
		return true;
	}
	
	/**
	 * Libera un asiento dentro del vag�n
	 * @param asiento
	 * @return verdad si todo ha ido bien, falso si el asiento ya estaba libre
	 */
	public boolean liberaBillete (int asiento) {
		if (this.asientos[asiento -1] == 0) {
			// el asiento ya estaba libre
			return false;
		}
		this.asientos[asiento -1] = 0;
		return true;
	}

	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * @return the asientos
	 */
	public int[] getAsientos() {
		return asientos;
	}
	
	
	/**
	 * @param asientos the asientos to set
	 */
	public void setAsientos(int[] asientos) {
		this.asientos = asientos;
	}


	/**
	 * Chequea si el asiento est� libre en el vag�n
	 * @param asiento El n�mero de asiento
	 * @return true si no hay billete en ese asiento, false en entro caso
	 */
	public boolean asientoLibre(int asiento) {
		return this.getAsientos()[asiento-1] == 0;
	}

	/**
	 * Devuelve una lista de strings con los n�meros de los asientos que hay libres en este vag�n
	 * @return {@link String}
	 */
	public String asientosLibres() {
		
		String losAsientos = new String("");
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] == 0) {
				losAsientos = losAsientos + " " + (i+1);
			}
		}
		return losAsientos;
	}
	
	/**
	 * Devuelve una lista de strings con los n�meros de los asientos ocupados este vag�n
	 * @return {@link String}
	 */
	public String asientosOcupados() {
		
		String losAsientos = new String("");
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != 0) {
				losAsientos = losAsientos + " " + (i+1);
			}
		}
		return losAsientos;
	}


	/**
	 * Devuelve una lista de strings con los n�meros de los billetes que se han vendido en este vag�n
	 * @return {@link String}
	 */
	public String billetesVendidos() {
		
		String losBilletes = new String("");
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != 0) {
				losBilletes = losBilletes + " " + asientos[i];
			}
		}
		return losBilletes;
	}

	/**
	 * Devuelve verdad si el vag�n est� lleno
	 * @return
	 */
	public boolean lleno() {
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] == 0) {
				// en cuanto encuentra un asiento libre, ya no est� lleno
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Vagon " + numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(asientos);
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagon other = (Vagon) obj;
		if (!Arrays.equals(asientos, other.asientos))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}


	
}
