package br.com.leoz.model.dao.jdbc;

import br.com.leoz.model.dao.MercadoriaDAO;
import br.com.leoz.model.dao.factory.AbstractDAOFactory;

public class JDBCDAOFactory implements AbstractDAOFactory {

	public MercadoriaDAO criarMercadoriaDAO() {
		return new MercadoriaJDBCDAO();
	}

}
