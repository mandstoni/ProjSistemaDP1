package com.br.service;

import com.br.model.Medico;
import com.br.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public void save(Medico medico){
        medicoRepository.save(medico);
    }

    public List<Medico> findAll(){
        return medicoRepository.findAll();
    }

    public Optional<Medico> findByID(String id){
        return medicoRepository.findById(id);
    }

    public void delete(String id){
        medicoRepository.deleteById(id);
    }
}
