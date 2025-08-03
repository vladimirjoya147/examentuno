package com.DAWI_T1_JOYA_VLADIMIR.demo.Service;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Entity.Curso;
import com.DAWI_T1_JOYA_VLADIMIR.demo.Repositorio.CursoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CursoServiceImplement implements CursoService{

    private final CursoRepositorio cursoRepositorio;
    @Override
    public List<Curso> listarCursos(String nombre) {
        return cursoRepositorio.findByNombreContaining(nombre);
    }
}
