package br.com.leoz.main.core;

import br.com.leoz.model.dao.factory.AbstractDAOFactory;
import br.com.leoz.model.dao.factory.XMLDAOFactory;
import br.com.leoz.view.factory.AbstractViewFactory;
import br.com.leoz.view.fx.FXViewFactory;

/**
 * 
 * @author Leonardo H. Zapparoli
 * 
 *         Cont�m alguns recursos comuns a aplica��o, nesse caso , a f�brica
 *         abstrata do DAO
 */
public class Resources {

	private AbstractDAOFactory daoFactory;
	private AbstractViewFactory viewFactory;

	public Resources() {
		iniciar();
	}

	private void iniciar() {
		daoFactory = new XMLDAOFactory();
		viewFactory = new FXViewFactory();
	}

	public AbstractDAOFactory getDaoFactory() {
		return daoFactory;
	}

	public AbstractViewFactory getViewFactory() {
		return viewFactory;
	}

}
