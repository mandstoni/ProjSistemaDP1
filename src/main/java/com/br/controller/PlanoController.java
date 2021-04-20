package com.br.controller;

import com.br.constant.Constant;
import com.br.model.Plano;
import com.br.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlanoController {

    @Autowired
    private PlanoService planoService;

    @PostMapping(Constant.API_PLANO)
    public void save(@RequestBody Plano plano){
        planoService.save(plano);
    }

    @GetMapping(Constant.API_PLANO)
    public List<Plano> findAll(){
        return planoService.findAll();
    }

    @PutMapping(Constant.API_PLANO)
    public void update(@RequestBody Plano plano){
        planoService.save(plano);
    }

    @DeleteMapping(Constant.API_PLANO + "/{id}")
    public void delete(@PathVariable("id") String id){
        planoService.delete(id);
    }

    @GetMapping(Constant.API_PLANO + "/{id}")
    public Optional<Plano> findById(@PathVariable("id") String id){
        return planoService.findByID(id);
    }
}
