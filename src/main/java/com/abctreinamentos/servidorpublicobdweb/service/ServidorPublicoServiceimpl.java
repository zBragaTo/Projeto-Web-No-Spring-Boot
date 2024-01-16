package com.abctreinamentos.servidorpublicobdweb.service;

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
	
	@Autowired
	public void setServidorPublicoService(ServidorPublicoService servidorService)
	{
		this.servidorService = servidorService;
	}
	
	
	@Override
	public List<ServidorPublico> listAll()
	{
		List<ServidorPublico> servidorespublicos = servidorService.listAll();
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
