/**
 * 
 */
package br.com.thiago.services;

import br.com.thiago.domain.Cliente;
import br.com.thiago.exceptions.DAOException;
import br.com.thiago.services.generic.IGenericService;

/**
 * @author thiago
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
