package com.qwertcardo.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.qwertcardo.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

}
