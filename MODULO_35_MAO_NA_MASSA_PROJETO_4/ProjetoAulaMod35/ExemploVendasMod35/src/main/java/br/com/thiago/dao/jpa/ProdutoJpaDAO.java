/**
 * 
 */
package br.com.thiago.dao.jpa;

import br.com.thiago.dao.generic.jpa.GenericJpaDAO;
import br.com.thiago.domain.jpa.ProdutoJpa;

/**
 * @author thiago
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
