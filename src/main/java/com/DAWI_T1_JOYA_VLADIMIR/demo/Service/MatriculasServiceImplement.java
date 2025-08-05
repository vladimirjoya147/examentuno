package com.DAWI_T1_JOYA_VLADIMIR.demo.Service;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Matricula;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio.MatriculaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MatriculasServiceImplement implements MatriculaService{

    private final MatriculaRepositorio matriculaRepositorio;
    @Override
    public List<Matricula> listarMatriculas(String email) {
        List<Matricula> matricula = matriculaRepositorio.findByAlumnoEmail(email);
        return matricula;
    }
}
