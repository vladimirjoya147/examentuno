package com.DAWI_T1_JOYA_VLADIMIR.demo.Service;

import com.DAWI_T1_JOYA_VLADIMIR.demo.Model.MatriculaModel;

import java.util.List;

public interface MatriculaService {

    public List<MatriculaModel> listarMatriculas(String email);
 }
