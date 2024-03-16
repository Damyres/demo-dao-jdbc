package model.dao;

import impl.VendedorDaoJDBC;

public class DaoFabrica {
    public static VendedorDao createVendedorDao() {
        return new VendedorDaoJDBC();
    }
}
