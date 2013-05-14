package br.com.leoz.model;

/**
 * 
 * @author Leonardo H.Zapparoli
 * 
 *         Classe que representara o conceito b�sico do todas Entidades do
 *         pacote Model (Modelo). Passivel de altera��es no futuro.
 * 
 */
public abstract class AbstractEntity {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
