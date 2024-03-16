package model.dao;

import entities.Departamento;
import entities.Vendedor;

import java.util.List;

public interface VendedorDao {
    void insert(Vendedor obj);

    void update(Vendedor obj);

    void deleteById(Vendedor id);

    Vendedor findById(Integer id);

    List<Vendedor> findAll();
}
