package br.com.leoz.view.fx;

import java.util.List;

import br.com.leoz.model.Mercadoria;
import br.com.leoz.presenter.strategy.IStrategy;
import br.com.leoz.view.MercadoriaViewHelper;

public class MercadoriaFXViewHelper implements MercadoriaViewHelper {

	private MercadoriaFXView view;

	public void iniciarView() {
		view = new MercadoriaFXView();

	}

	public void preencherCampos(Mercadoria t) {

	}

	public Mercadoria getBeanPreenchido() {

		return null;
	}

	public void setListaCadastrados(List<Mercadoria> lista) {

	}

	public void setStrategyGravar(IStrategy s) {

	}

	public void setStrategyAtualizar(IStrategy s) {

	}

	public void setStrategyRemover(IStrategy s) {

	}

	public void setStrategyNovo(IStrategy s) {

	}

	public void setBeanSelecionado(IStrategy s) {

	}

}
