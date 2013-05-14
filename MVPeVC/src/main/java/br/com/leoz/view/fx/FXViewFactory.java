package br.com.leoz.view.fx;

import br.com.leoz.view.MercadoriaViewHelper;
import br.com.leoz.view.factory.AbstractViewFactory;

public class FXViewFactory implements AbstractViewFactory {

	public MercadoriaViewHelper criarMercadoriaViewHelper() {
		return new MercadoriaFXViewHelper();
	}

}
