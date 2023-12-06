/**
 * 
 */
package br.com.thiago.dao.jpa;

import br.com.thiago.dao.generic.jpa.GenericJpaDAO;
import br.com.thiago.domain.jpa.ClienteJpa;

/**
 * @author thiago
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
