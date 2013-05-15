package br.com.leoz.presenter;

import java.util.ArrayList;
import java.util.List;

import br.com.leoz.model.Mercadoria;
import br.com.leoz.model.dao.MercadoriaDAO;
import br.com.leoz.presenter.strategy.AbstractAction;
import br.com.leoz.view.MercadoriaViewHelper;

/**
 * @author Leonardo H. Zapparoli O presenter comanda a view e os dados. O Modelo
 *         de passive-view delega todas as movimenta��o a esta classe, que �
 *         respons�vel por chamar os states. O AbstractAction em forma de classe
 *         an�nima pode ser refatorado para uma classe concreta, se desejado. O
 *         interessante � que a utiluiza��o dele n�o nos obriga a criar nenhum
 *         vinculo com os listeners da GUI, seja qual for o tipo dela.
 */
public class MercadoriaPresenter implements IPresenter<Mercadoria> {

	private Mercadoria bean;
	private List<Mercadoria> listaModel;
	private MercadoriaViewHelper viewHelper;
	private MercadoriaDAO dao;
	private PresenterUtils utils;

	public void iniciar() {
		utils = new PresenterUtils();
	}

	public void iniciarView() {
		viewHelper.iniciarView();
	}

	public Mercadoria getModel() {
		return bean;
	}

	public void configurarView() {
		viewHelper = utils.getViewFactory().criarMercadoriaViewHelper();
	}

	public void configurarModel() {
		bean = new Mercadoria();
		listaModel = new ArrayList<Mercadoria>();
		dao = utils.getDAOFactory().criarMercadoriaDAO();
	}

	public void configurarStrategies() {
		viewHelper.setListaCadastrados(listaModel);

		viewHelper.setBeanSelecionado(new AbstractAction() {

			public void acao() {

			}
		});

		viewHelper.setStrategyAtualizar(new AbstractAction() {

			public void acao() {

			}
		});

		viewHelper.setStrategyNovo(new AbstractAction() {

			public void acao() {

			}
		});

		viewHelper.setStrategyGravar(new AbstractAction() {

			public void acao() {

				Mercadoria beanPreenchido = viewHelper.getBeanPreenchido();
				dao.salvar(beanPreenchido);

			}
		});

		viewHelper.setStrategyRemover(new AbstractAction() {

			public void acao() {

			}
		});
	}
}
