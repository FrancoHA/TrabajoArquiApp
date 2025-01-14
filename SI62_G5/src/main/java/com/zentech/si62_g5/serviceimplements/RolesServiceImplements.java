package com.zentech.si62_g5.serviceimplements;

import com.zentech.si62_g5.entities.Roles;
import com.zentech.si62_g5.repositories.IRolesRepository;
import com.zentech.si62_g5.serviceinterfaces.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImplements implements IRolesService {

    @Autowired
    private IRolesRepository rR;

    @Override
    public List<Roles> list() {
        return rR.findAll();
    }
}
