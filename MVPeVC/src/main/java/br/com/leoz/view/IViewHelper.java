package br.com.leoz.view;

import java.util.List;

import br.com.leoz.presenter.strategy.AbstractAction;

public interface IViewHelper<T> {

	void iniciarView();

	void preencherCampos(T t);

	T getBeanPreenchido();

	void limparCampos();

	boolean camposVazios();

	void setListaCadastrados(List<T> lista);

	void setStrategyGravar(AbstractAction s);

	void setStrategyAtualizar(AbstractAction s);

	void setStrategyRemover(AbstractAction s);

	void setStrategyNovo(AbstractAction s);

	void setBeanSelecionado(AbstractAction s);

}
