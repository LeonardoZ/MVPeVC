package br.com.leoz.view;

import java.util.List;

import br.com.leoz.presenter.strategy.IStrategy;

public interface IViewHelper<T> {

	void iniciarView();

	void preencherCampos(T t);

	T getBeanPreenchido();

	void setListaCadastrados(List<T> lista);

	void setStrategyGravar(IStrategy s);

	void setStrategyAtualizar(IStrategy s);

	void setStrategyRemover(IStrategy s);

	void setStrategyNovo(IStrategy s);

	void setBeanSelecionado(IStrategy s);

}
