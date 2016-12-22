package br.com.cannoni.commons.utils.strings;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

/**
 * @author patrizio
 * @since 02/03/2015
 */
public class MatchCodeCalculator {

	/**
	 * Construtor.
	 */
	private MatchCodeCalculator() {
		super();
	}

	/**
	 * Calcula o Match Code entre duas Strings.
	 * 
	 * @param s1
	 *            {@link String}
	 * @param s2
	 *            {@link String}
	 * @return {@link BigDecimal}
	 */
	public static int calcularMatchCode(String s1, String s2) {
		return StringUtils.getLevenshteinDistance(s1, s2);
	}

}
