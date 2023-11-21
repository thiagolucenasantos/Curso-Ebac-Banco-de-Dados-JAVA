package test;

import domain.Cliente;
import org.junit.Test;
import pacoteDao.ClienteDao;
import pacoteDao.IClienteDao;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void cadastrarTest() throws Exception {
        IClienteDao dao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Thiago");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());
    }
}
