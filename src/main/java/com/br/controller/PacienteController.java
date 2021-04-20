package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Paciente;
import com.br.service.PacienteService;
import com.br.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping(Constant.API_PACIENTE)
    public void save(@RequestBody Paciente paciente){
        pacienteService.save(paciente);
    }

    @GetMapping(Constant.API_PACIENTE)
    public List<Paciente> findAll(){
        return pacienteService.findAll();
    }

    @PutMapping(Constant.API_PACIENTE)
    public void update(@RequestBody Paciente paciente){
        pacienteService.save(paciente);
    }

    @DeleteMapping(Constant.API_PACIENTE + "/{id}")
    public void delete(@PathVariable("id") String id){
        pacienteService.delete(id);
    }

    @GetMapping(Constant.API_PACIENTE + "/{id}")
    public Optional<Paciente> findById(@PathVariable("id") String id){
        return pacienteService.findById(id);
    }
}