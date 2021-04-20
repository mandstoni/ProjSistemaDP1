package com.br.service;

import com.br.model.Plano;
import com.br.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository planoRepository;

    public void save(Plano plano){
        planoRepository.save(plano);
    }

    public List<Plano> findAll(){
        return planoRepository.findAll();
    }

    public Optional<Plano> findByID(String id){
        return planoRepository.findById(id);
    }

    public void delete(String id){
        planoRepository.deleteById(id);
    }
}
