package impl;

import db.DB;
import db.DbException;
import entities.Departamento;
import entities.Vendedor;
import model.dao.VendedorDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class VendedorDaoJDBC implements VendedorDao {

    private Connection conn;

    public VendedorDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Vendedor obj) {

    }

    @Override
    public void update(Vendedor obj) {

    }

    @Override
    public void deleteById(Vendedor id) {

    }

    @Override
    public Vendedor findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "select  NOME, EMAIL "
                            + "from VENDEDOR "
                            + " WHERE ID = ? ");



            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId(rs.getInt("DEPARTAMENTO_ID"));
                departamento.setNome(rs.getString("NOME"));
                Vendedor obj = new Vendedor();
                obj.setId(rs.getInt("ID"));
                obj.setNome(rs.getString("NOME"));
                obj.setEmail(rs.getString("EMAIL"));
            }
            return null;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatemaint(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Vendedor> findAll() {
        return null;
    }
}
