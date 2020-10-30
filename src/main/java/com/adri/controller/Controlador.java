/**
 * 
 */
package com.adri.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.negocio.ICalculo;

/**
 * @author 201907
 *
 */
@Controller
public class Controlador {

	@Autowired
	ICalculo calculo;
	
	@RequestMapping("coche")
	public String coche(@RequestParam("nombre") String name, ModelMap model) {
		
		try {
			int numeroCoches = calculo.calculoCoches(name);
			model.addAttribute("coche", numeroCoches);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "coche";
	}
	
	
	
}
