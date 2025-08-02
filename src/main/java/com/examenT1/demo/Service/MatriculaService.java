package com.examenT1.demo.Service;

import com.examenT1.demo.Entity.Matricula;
import com.examenT1.demo.Model.MatriculaModel;

import java.util.List;

public interface MatriculaService {

    public List<MatriculaModel> listarMatriculas(String email);
 }
