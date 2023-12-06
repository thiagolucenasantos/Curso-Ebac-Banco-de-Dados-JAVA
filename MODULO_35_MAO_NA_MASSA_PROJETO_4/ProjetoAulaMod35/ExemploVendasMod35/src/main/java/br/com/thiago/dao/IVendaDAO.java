/**
 * 
 */
package br.com.thiago.dao;

import br.com.thiago.dao.generic.IGenericDAO;
import br.com.thiago.domain.Venda;
import br.com.thiago.exceptions.DAOException;
import br.com.thiago.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author thiago
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
