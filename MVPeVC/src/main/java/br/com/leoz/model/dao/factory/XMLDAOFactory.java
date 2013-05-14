package br.com.leoz.model.dao.factory;

import br.com.leoz.model.dao.MercadoriaDAO;
import br.com.leoz.model.dao.xml.MercadoriaXMLDAO;

/**
 * 
 * @author Leonardo H. Zapparoli Versão concreta da AbstractDAOFactory, voltada
 *         para o XML(apenas um exemplo das possibilidades)
 */
public class XMLDAOFactory implements AbstractDAOFactory {

	private MercadoriaDAO mercadoriaDAO = null;

	public MercadoriaDAO criarMercadoriaDAO() {
		return mercadoriaDAO == null ? mercadoriaDAO = new MercadoriaXMLDAO()
				: mercadoriaDAO;
	}

}
