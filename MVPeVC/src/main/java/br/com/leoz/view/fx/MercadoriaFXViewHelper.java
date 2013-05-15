package br.com.leoz.view.fx;

import java.util.List;

import br.com.leoz.model.Mercadoria;
import br.com.leoz.presenter.strategy.AbstractAction;
import br.com.leoz.view.MercadoriaViewHelper;

public class MercadoriaFXViewHelper implements MercadoriaViewHelper {
	private MercadoriaFXView view = null;
	private AbstractAction gravarAction;
	private AbstractAction atualizarAction;
	private AbstractAction removerAction;
	private AbstractAction novoAction;
	private AbstractAction selecionadoAction;
	private List<Mercadoria> lista;

	public void iniciarView() {
		view = new MercadoriaFXView();

	}

	public void preencherCampos(Mercadoria t) {
		// preenche a tela com a informação do bean
	}

	public boolean camposVazios() {
		return false;
	}

	public void limparCampos() {
		// limpar campos da view
	}

	public Mercadoria getBeanPreenchido() {
		if (camposVazios())
			throw new IllegalStateException(
					"Os campos do seu bean estão vazios");
		// Crie um Bean, preencha seus campos e o retorne
		return null;
	}

	public void setListaCadastrados(List<Mercadoria> lista) {
		this.lista = lista;
		// repassar a algum model, ou para a view diretamente;
	}

	public void setStrategyGravar(AbstractAction s) {
		this.gravarAction = s;
		// instanciar listener e repassar a ação para ele
	}

	public void setStrategyAtualizar(AbstractAction s) {
		atualizarAction = s;
	}

	public void setStrategyRemover(AbstractAction s) {
		removerAction = s;
		// view.setAction...
	}

	public void setStrategyNovo(AbstractAction s) {
		novoAction = s;
	}

	public void setBeanSelecionado(AbstractAction s) {
		selecionadoAction = s;
	}

}
