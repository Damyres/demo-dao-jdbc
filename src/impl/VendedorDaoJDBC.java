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
                    "SELECT " +
                            " V.ID AS VENDEDOR_ID, " +
                            " V.NOME AS VENDEDOR, " +
                            " V.EMAIL AS EMAIL, " +
                            " V.DATA AS DATA, " +
                            " V.SALARIO_BASE AS SALARIO, " +
                            " D.ID AS DEPARTAMENTO_ID, " +
                            " D.NOME AS DEPARTAMENTO " +
                            " FROM VENDEDOR V " +
                            " INNER JOIN DEPARTAMENTO D ON V.DEPARTAMENTO_ID = D.ID " +
                            " WHERE V.ID = ? "
);

//            "select  NOME, EMAIL "
//                    + "from VENDEDOR "
//                    + " WHERE ID = ? "


            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Departamento departamento = new Departamento();
                departamento.setId(rs.getInt("DEPARTAMENTO_ID"));
                departamento.setNome(rs.getString("DEPARTAMENTO"));

                Vendedor vendedor = new Vendedor();
                vendedor.setId(rs.getInt("VENDEDOR_ID"));
                vendedor.setNome(rs.getString("VENDEDOR"));
                vendedor.setEmail(rs.getString("EMAIL"));
                vendedor.setSalarioBase(rs.getDouble("SALARIO"));
                vendedor.setData(rs.getDate("DATA"));
                vendedor.setDepartamento(departamento);
                return vendedor;
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
