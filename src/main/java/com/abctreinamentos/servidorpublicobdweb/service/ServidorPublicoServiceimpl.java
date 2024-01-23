package com.abctreinamentos.servidorpublicobdweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abctreinamentos.servidorpublicobdweb.entity.ServidorPublico;
import com.abctreinamentos.servidorpublicobdweb.repository.ServidorPublicoRepository;

@Service
public class ServidorPublicoServiceimpl implements ServidorPublicoService{
	
	@Autowired
	private ServidorPublicoRepository servidorRepository;
	
	@Override
	public List<ServidorPublico> listAll()
	{
		List<ServidorPublico> servidorespublicos = new ArrayList()<>();
		servidorRepository.findAll().forEach(servidorespublicos::add);
	}

	public Optional<ServidorPublico> listByMatricula(long matricula)
	{
		Optional<ServidorPublico> servidorEncontrado = servidorService.listByMatricula(matricula);
	}

	@Override
	public void save(ServidorPublico servidor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ServidorPublico servidor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long matricula) {
		// TODO Auto-generated method stub
		
	}

}
