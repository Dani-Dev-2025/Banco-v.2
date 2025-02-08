package cuentas;
public class Main {
	
	/* 
	 * este es un comentario que sólo sirve para ver comprobar que 
	 * aparece en la página GitHub tras realizar un segundo commit 
	 * y otro push.
	 */
	
    public static void main(String[] args) {
        Cuenta cuentaDaniel;
        cuentaDaniel = new Cuenta("Daniel Pacheco", "1000-2365-85-1230456789", 2500);
        System.out.println(cuentaDaniel.toString());
        System.out.println("\nEl saldo actual es: "+ cuentaDaniel.getSaldo());

        try {
			int cantidadRetirada = 2000;
			System.out.println("Retiramos " + cantidadRetirada + " en cuenta");
		    cuentaDaniel.retirar(cantidadRetirada);
		} catch (Exception e) {
		    System.out.print("Fallo al retirar");
		}
		try {
		    int cantidadIngresada = 600;
			System.out.println("Ingresamos " + cantidadIngresada + " en cuenta");
		    cuentaDaniel.ingresar(cantidadIngresada);
		} catch (Exception e) {
		    System.out.print("Fallo al ingresar");
		}

        System.out.println("El saldo actual es: "+ cuentaDaniel.getSaldo());
    }
}
