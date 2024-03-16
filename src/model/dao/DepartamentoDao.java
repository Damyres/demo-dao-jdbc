package model.dao;

import entities.Departamento;

import java.util.List;

public interface DepartamentoDao {
    void insert(Departamento obj);

    void update(Departamento obj);

    void deleteById(Departamento id);

    Departamento findById(Integer id);

    List<Departamento> findAll();
}
