package me.dio.academia.digital.service.impl;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    public Matricula create(@Valid MatriculaForm form) {
        return null;
    }

    public java.util.List<Matricula> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Matricula get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
