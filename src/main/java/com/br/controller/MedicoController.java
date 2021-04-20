package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Medico;
import com.br.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @PostMapping(Constant.API_MEDICO)
    public void save(@RequestBody Medico medico){
        medicoService.save(medico);
    }

    @GetMapping(Constant.API_MEDICO)
    public List<Medico> findAll(){
        return medicoService.findAll();
    }

    @PutMapping(Constant.API_MEDICO)
    public void update(@RequestBody Medico medico){
        medicoService.save(medico);
    }

    @DeleteMapping(Constant.API_MEDICO + "/{id}")
    public void delete(@PathVariable("id") String id){
        medicoService.delete(id);
    }

    @GetMapping(Constant.API_MEDICO + "/{id}")
    public Optional<Medico> findById(@PathVariable("id") String id){
        return medicoService.findByID(id);
    }

}
