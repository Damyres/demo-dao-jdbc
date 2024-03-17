package model.dao;

import db.DB;
import impl.VendedorDaoJDBC;

public class DaoFabrica {
    public static VendedorDao createVendedorDao() {
        return new VendedorDaoJDBC(DB.getConnection());
    }
}
