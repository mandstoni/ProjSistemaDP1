package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Agenda;
import com.br.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping(Constant.API_AGENDA)
    public void save(@RequestBody Agenda agenda){
        agendaService.save(agenda);
    }

    @GetMapping(Constant.API_AGENDA)
    public List<Agenda> findAll(){
        return agendaService.findAll();
    }

    @PutMapping(Constant.API_AGENDA)
    public void update(@RequestBody Agenda agenda){
        agendaService.save(agenda);
    }

    @DeleteMapping(Constant.API_AGENDA + "/{id}")
    public void delete(@PathVariable("id") String id){
        agendaService.delete(id);
    }

    @GetMapping(Constant.API_AGENDA + "/{id}")
    public Optional<Agenda> findById(@PathVariable("id") String id){
        return agendaService.findById(id);
    }


}
