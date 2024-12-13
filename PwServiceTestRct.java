package pio.daw.rct.encriptador;

public class PwServiceTestRct {
	
	public static void main(String[] args) {
		PwServiceRct servicio = new PwServiceRct();
		String password ="MiSuperPassword";
		String passwordEncriptada= servicio.encriptarContraseña(password);
		System.out.println("Prueba de alumno Rubén Carrillo");
		System.out.println("La contraseña encriptada es: "+ passwordEncriptada);
		
		boolean esValida =servicio.verificarContraseña(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es valida: "+ esValida);
		
	}

}
