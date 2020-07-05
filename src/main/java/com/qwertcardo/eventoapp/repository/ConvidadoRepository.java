package com.qwertcardo.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.qwertcardo.eventoapp.models.Convidado;
import com.qwertcardo.eventoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	
	public Iterable<Convidado> findByEvento(Evento evento);
	public Convidado findByRg(String rg);

}
