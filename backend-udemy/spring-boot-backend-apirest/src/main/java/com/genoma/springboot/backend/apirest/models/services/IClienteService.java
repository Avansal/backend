package com.genoma.springboot.backend.apirest.models.services;

import java.util.List;

import com.genoma.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService  {

		public List<Cliente> findAll();
}
