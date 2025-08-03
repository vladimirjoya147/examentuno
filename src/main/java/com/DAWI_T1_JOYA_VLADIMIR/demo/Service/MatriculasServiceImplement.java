package com.DAWI_T1_JOYA_VLADIMIR.demo.Service;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio.MatriculaRepositorio;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Model.MatriculaModel;
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
