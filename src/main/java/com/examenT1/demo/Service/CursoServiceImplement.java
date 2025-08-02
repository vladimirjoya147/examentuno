package com.examenT1.demo.Service;

import com.examenT1.demo.Entity.Curso;
import com.examenT1.demo.Repositorio.CursoRepositorio;
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
