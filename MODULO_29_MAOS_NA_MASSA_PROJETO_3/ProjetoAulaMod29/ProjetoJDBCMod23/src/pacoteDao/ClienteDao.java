package pacoteDao;

import dao.jdbc.ConnectionFactory;
import domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao implements IClienteDao {
    @Override
    public Integer cadastrar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tb_cliente (id, nome, codigo) VALUES (nextval('sq_cliente'), ?, ?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getCodigo());
            stm.setString(2, cliente.getNome());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !stm.isClosed()) {
                connection.close();
            }
        }

    }
    @Override
    public Cliente consultar(String codigo) throws Exception {
        return null;
    }
}
