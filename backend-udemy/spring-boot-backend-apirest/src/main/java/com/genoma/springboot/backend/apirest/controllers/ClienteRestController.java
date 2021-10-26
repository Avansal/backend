package com.genoma.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.genoma.springboot.backend.apirest.models.entity.Cliente;
import com.genoma.springboot.backend.apirest.models.services.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
		@Autowired
		private IClienteService clienteService;
		
		@GetMapping("/clientes")
		public List<Cliente> index(){
			return clienteService.findAll();
		}
}
