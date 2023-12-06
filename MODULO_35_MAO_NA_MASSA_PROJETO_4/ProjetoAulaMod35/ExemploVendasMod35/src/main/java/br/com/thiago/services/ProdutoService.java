/**
 * 
 */
package br.com.thiago.services;

import br.com.thiago.dao.IProdutoDAO;
import br.com.thiago.domain.Produto;
import br.com.thiago.services.generic.GenericService;

/**
 * @author thiago
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
