package br.com.leoz.model.dao;

import java.util.List;

import br.com.leoz.model.Mercadoria;

/**
 * 
 * @author Leonardo H. Zapparoli Em virtude das nuances que podem haver entre as
 *         opera��es b�sicas do DAO, � seguro e menos problem�tico criar uma
 *         interface espec�fica para a entide em quest�o;
 */
public interface MercadoriaDAO extends ComandosDAO<Mercadoria> {

	List<Mercadoria> selecionarAcimaDe(Float quantidade);

	List<Mercadoria> selecionarAbaixoDe(Float quantidade);

}
