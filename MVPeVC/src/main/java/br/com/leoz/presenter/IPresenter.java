package br.com.leoz.presenter;

public interface IPresenter<T> {

	void iniciar();

	void iniciarView();

	T getModel();

	void configurarView();

	void configurarModel();

	void configurarStrategies();

}
