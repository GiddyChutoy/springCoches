/**
 * 
 */
package com.adri.negocio;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adri.datos.IDatos;

/**
 * @author Giddy
 *
 */
@Component
public class Calculo implements ICalculo {
	
	@Autowired
	IDatos datos;
	
	@Override
	public int calculoCoches(String nombre) throws IOException {
		//IDatos datos = new Datos();
		int contador = 0;
		
		for (String propietario : datos.consultaLista()) {
			if(propietario.equalsIgnoreCase(nombre)) {
				contador++;
			}
		}
		
		return contador;
	}
}
