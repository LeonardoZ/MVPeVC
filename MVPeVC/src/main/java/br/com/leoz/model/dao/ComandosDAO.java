package br.com.leoz.model.dao;

import java.util.List;

public interface ComandosDAO<T> {

	boolean salvar(T t);

	boolean get(Long id);

	boolean atualizar(T t);

	boolean remover(T t);

	List<T> selecionar();

}
