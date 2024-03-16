package application;
import entities.Departamento;
import entities.Vendedor;
import model.dao.DaoFabrica;
import model.dao.VendedorDao;

import java.util.Date;

public class Programa {
    public static void main(String[] args) {
        Departamento obj = new Departamento(1, "Livros");
        System.out.println(obj);

        Vendedor vendedor = new Vendedor(21, "Bob", "bob@gmail.com",
                new Date(), 3000.00, obj);

        VendedorDao vendedorDao = DaoFabrica.createVendedorDao();
        System.out.println(vendedor);

    }
}
