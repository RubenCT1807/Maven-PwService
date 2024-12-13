package pio.daw.rct.encriptador;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceRct {
		
	private BasicPasswordEncryptor passwordEncryptor;
	public PwServiceRct() {
		
	}
		
	public String encriptarContraseña(String contraseña) {
		return passwordEncryptor.encryptPassword(contraseña);
		
	}
		
	public boolean verificarContraseña(String contraseña, String contraseñaEncriptada) {
		return passwordEncryptor.checkPassword(contraseña, contraseñaEncriptada);
		
	}
		

}
