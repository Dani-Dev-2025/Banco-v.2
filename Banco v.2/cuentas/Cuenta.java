package cuentas;

/**
 * la clase Cuenta.java simula una cuenta bancaria. Sus atributos son nombre,
 * número de la cuenta y el saldo. Con los métodos correspondientes se puede
 * ingresar y sacar dinero.
 * 
 * @author Daniel Pacheco
 * @version 1.0
 * @since 03/02/2025
*/

public class Cuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	
	/** este es el método constructor por defecto. Lo que hace es crear 
	 * una nueva cuenta pero sin inicializar los valores
	 */

	public Cuenta() {

  }
	/** este es el método constructor con los parámetros: nombre del titular,
	 * número de la cuenta y el saldo con el que se abre por primera vez
	 */

	public Cuenta(String nombre, String cuenta, double saldo) {
        this.setNombre(nombre);
        this.setCuenta(cuenta);
        this.setSaldo(saldo);
    }
	
	/**
	 * @return una cadena de texto con la información: nombre del titular
	 * y su número de cuenta
	 */

	@Override
    public String toString() {
    	return "Titular: " + getNombre() + "\nCuenta: " + getCuenta();
    }

	/**
	 * método para ingresar dinero
	 * @param cantidad -> recibe como parámetro el dinero que se va a ingresar
	 * @throws Exception -> se lanza una excepción si la cantidad introducida es
	 * menor que 0 y muestra por pantalla el mensaje correspondiente
	 */
	
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
	
	/**
	 * método para retirar dinero
	 * @param cantidad -> recibe el parámetro con la cantidad a retirar
	 * @throws Exception -> si se introduce una cantidad negativa o no hay
	 * saldo, se lanza la excepción y se muestra el correspondiente mensaje
	 * por pantalla
	 */

	public void retirar(double cantidad) throws Exception {

		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");

		if (getSaldo() < cantidad)
			throw new Exception("No se hay suficiente saldo");

		setSaldo(getSaldo() - cantidad);
	}
	
	/**
	 * devuelve el saldo actual
	 * @return saldo
	 */

	public double getSaldo() {
		return saldo;
	}
	/**
	 * modifica el saldo de la cuenta
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * devuelve los dígitos del número de cuenta
	 * @return número de cuenta
	 */

	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * modifica el número de cuenta
	 * @param número de cuenta
	 */

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * devuelve el nombre del titular de la cuenta
	 * @return nombre del titular
	 */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * modifica el nombre del titular de la cuenta
	 * @param nombre del titular
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
