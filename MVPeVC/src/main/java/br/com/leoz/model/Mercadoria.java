package br.com.leoz.model;

/**
 * 
 * @author Leonardo H. Zapparoli Entidade concreta Mercadoria. Representa uma
 *         tabela na Base de dados, ou algum modelo de informação.
 */
public class Mercadoria extends AbstractEntity {

	private String descricao;
	private Float quantidade;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Mercadoria other = (Mercadoria) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;

		return true;
	}

}
