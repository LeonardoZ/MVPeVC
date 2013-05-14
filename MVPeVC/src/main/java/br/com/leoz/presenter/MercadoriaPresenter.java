package br.com.leoz.presenter;

import java.util.ArrayList;
import java.util.List;

import br.com.leoz.model.Mercadoria;
import br.com.leoz.model.dao.MercadoriaDAO;
import br.com.leoz.presenter.strategy.IStrategy;
import br.com.leoz.view.MercadoriaViewHelper;

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

		viewHelper.setBeanSelecionado(new IStrategy() {

			public void acao() {
				// TODO Auto-generated method stub

			}
		});
		viewHelper.setStrategyAtualizar(new IStrategy() {

			public void acao() {
				// TODO Auto-generated method stub

			}
		});

		viewHelper.setStrategyNovo(new IStrategy() {

			public void acao() {
				// TODO Auto-generated method stub

			}
		});

		viewHelper.setStrategyGravar(new IStrategy() {

			public void acao() {
				// TODO Auto-generated method stub

			}
		});

		viewHelper.setStrategyRemover(new IStrategy() {

			public void acao() {
				// TODO Auto-generated method stub

			}
		});
	}
}
