package com.examenT1.demo.Service;

import com.examenT1.demo.Entity.Matricula;
import com.examenT1.demo.Model.MatriculaModel;
import com.examenT1.demo.Repositorio.MatriculaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MatriculasServiceImplement implements MatriculaService{

    private final MatriculaRepositorio matriculaRepositorio;
    @Override
    public List<MatriculaModel> listarMatriculas(String email) {
        List<MatriculaModel> matricula = matriculaRepositorio.listarMatriculasPorEmail(email);
        return matricula;
    }
}
