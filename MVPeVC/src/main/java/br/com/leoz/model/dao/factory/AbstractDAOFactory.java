package br.com.leoz.model.dao.factory;

import br.com.leoz.model.dao.MercadoriaDAO;

/**
 * 
 * @author Leonardo H. Zapparoli
 * 
 *         Padrão de projeto "Abstract Factory"
 */
public interface AbstractDAOFactory {

	MercadoriaDAO criarMercadoriaDAO();
	
}
