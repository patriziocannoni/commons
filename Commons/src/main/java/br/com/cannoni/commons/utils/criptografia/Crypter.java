package br.com.cannoni.commons.utils.criptografia;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Classe com métodos para criptografar textos.
 * 
 * @author Patrizio
 * @since 30/10/2014
 */
public class Crypter {

	/**
	 * Construtor.
	 */
	private Crypter() {
		super();
	}

	/**
	 * Criptografa um texto com algoritomo One Way, de forma que não seja possível, em teoria, voltar para o texto
	 * original.
	 * 
	 * @param texto
	 *            O texto original
	 * @return String O texto criptografado
	 */
	public static String cryptOneWay(final String texto) {
		return DigestUtils.sha256Hex(texto);
	}

}
