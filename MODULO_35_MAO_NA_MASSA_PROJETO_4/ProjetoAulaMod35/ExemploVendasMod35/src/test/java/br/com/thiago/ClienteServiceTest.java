/**
 * 
 */
package br.com.thiago;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.thiago.dao.ClienteDaoMock;
import br.com.thiago.dao.IClienteDAO;
import br.com.thiago.domain.Cliente;
import br.com.thiago.exceptions.DAOException;
import br.com.thiago.exceptions.TipoChaveNaoEncontradaException;
import br.com.thiago.services.ClienteService;
import br.com.thiago.services.IClienteService;

/**
 * @author thiago
 *
 */
public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Thiago");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Thiago");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Thiago", cliente.getNome());
	}
}
