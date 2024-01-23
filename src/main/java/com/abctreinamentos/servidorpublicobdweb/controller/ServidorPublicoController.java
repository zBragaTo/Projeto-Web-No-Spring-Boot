package com.abctreinamentos.servidorpublicobdweb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abctreinamentos.servidorpublicobdweb.service.ServidorPublicoService;

@RestController
public class ServidorPublicoController {
	
	private ServidorPublicoService servidorService;
	
	@Autowired
	public void setServidorPublicoService(ServidorPublicoService servidorService)
	{
		this.servidorService = servidorService;
	}
	
	@GetMapping("/listarServidores")
	public String listarServidores(Model model)
	{
		model.addAttribute("servidorespublicos",servidorService.listAll());
		return "servidorespublicos";
	}
	
	@GetMapping("/listarServidor/{matricula}")
	public String listarServidores(@PathVariable long matricula, Model model)
	{
		model.addAttribute("servidorpublico",servidorService.listByMatricula(matricula));
		return "servidorespublicos";
	}

}
