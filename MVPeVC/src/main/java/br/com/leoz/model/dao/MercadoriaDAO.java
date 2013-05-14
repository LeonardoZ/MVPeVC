package br.com.leoz.model.dao;

import java.util.List;

import br.com.leoz.model.Mercadoria;

/**
 * 
 * @author Leonardo H. Zapparoli Em virtude das nuances que podem haver entre as
 *         operações básicas do DAO, é seguro e menos problemático criar uma
 *         interface específica para a entide em questão;
 */
public interface MercadoriaDAO extends ComandosDAO<Mercadoria> {

	List<Mercadoria> selecionarAcimaDe(Float quantidade);

	List<Mercadoria> selecionarAbaixoDe(Float quantidade);

}
