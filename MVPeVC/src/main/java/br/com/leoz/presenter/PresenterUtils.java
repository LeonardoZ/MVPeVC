package br.com.leoz.presenter;

import br.com.leoz.main.core.Resources;
import br.com.leoz.model.dao.factory.AbstractDAOFactory;
import br.com.leoz.view.factory.AbstractViewFactory;

public class PresenterUtils {

	private Resources recursos;

	public PresenterUtils() {
		iniciar();
	}

	private void iniciar() {
		recursos = new Resources();
	}

	public AbstractDAOFactory getDAOFactory() {
		return recursos.getDaoFactory();
	}

	public AbstractViewFactory getViewFactory() {
		return recursos.getViewFactory();
	}

	public Resources getRecursos() {
		return recursos;
	}
}
