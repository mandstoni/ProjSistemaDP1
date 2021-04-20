package com.br.service;

import com.br.model.Agenda;
import com.br.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public void save(Agenda agenda){
        agendaRepository.save(agenda);
    }

    public List<Agenda> findAll(){
        return agendaRepository.findAll();
    }

    public Optional<Agenda> findById(String id){
        return agendaRepository.findById(id);
    }

    public void delete(String id){
        agendaRepository.deleteById(id);
    }

}
