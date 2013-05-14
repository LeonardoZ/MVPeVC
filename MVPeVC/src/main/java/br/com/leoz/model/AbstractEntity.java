package br.com.leoz.model;

/**
 * 
 * @author Leonardo H.Zapparoli
 * 
 *         Classe que representara o conceito básico do todas Entidades do
 *         pacote Model (Modelo). Passivel de alterações no futuro.
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
