/**
 * 
 */
package br.com.thiago;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.thiago.dao.IProdutoDAO;
import br.com.thiago.dao.ProdutoDaoMock;
import br.com.thiago.domain.Produto;
import br.com.thiago.exceptions.DAOException;
import br.com.thiago.exceptions.TipoChaveNaoEncontradaException;
import br.com.thiago.services.IProdutoService;
import br.com.thiago.services.ProdutoService;

/**
 * @author thiago
 *
 */
public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() throws DAOException {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		produto.setNome("Thiago");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Thiago", produto.getNome());
	}
}
