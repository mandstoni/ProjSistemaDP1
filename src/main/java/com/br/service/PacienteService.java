package com.br.service;

import com.br.model.Paciente;
import com.br.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public void save(Paciente paciente){
        pacienteRepository.save(paciente);
    }

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findById(String id){

        return pacienteRepository.findById(id);
    }

    public void delete(String id){
        pacienteRepository.deleteById(id);
    }
}
