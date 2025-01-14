package com.zentech.si62_g5.controllers;


import com.zentech.si62_g5.dtos.RolesDTO;
import com.zentech.si62_g5.dtos.TipoSuscripcionesDTO;
import com.zentech.si62_g5.serviceinterfaces.ITipoSuscripcionesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class TipoSuscripcionesController {

    @Autowired
    private ITipoSuscripcionesService tS;

    @GetMapping
    public List<TipoSuscripcionesDTO> listar()
    {
        return tS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,TipoSuscripcionesDTO.class);
        }).collect(Collectors.toList());
    }
}
