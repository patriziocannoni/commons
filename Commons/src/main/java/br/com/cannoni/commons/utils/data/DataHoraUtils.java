package br.com.cannoni.commons.utils.data;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

/**
 * Utilidades de data e hora.
 * 
 * @author Patrizio
 * @since 22/05/2013
 */
public class DataHoraUtils {

	/**
	 * Construtor.
	 */
	private DataHoraUtils() {
		super();
	}

	/**
	 * Retorna o começo da data de hoje, ou seja a data atual no primeiro segundo do dia.
	 * 
	 * @return Date a data de hoje no começo do dia
	 */
	public static Calendar obterInicioDataAtual() {
		return obterInicioData(Calendar.getInstance());
	}

	/**
	 * Retorna o começo da data passada de tipo {@link Calendar}, no primeiro segundo do dia.
	 * 
	 * @param calendar
	 *            pela qual calcular o começo do dia
	 * @return {@link Calendar} no começo do dia
	 */
	public static Calendar obterInicioData(final Calendar calendar) {
		return DateUtils.truncate(calendar, Calendar.DAY_OF_MONTH);
	}

	/**
	 * Retorna o começo da data passada de tipo {@link Date}, no primeiro segundo do dia.
	 * 
	 * @param data
	 *            pela qual calcular o começo do dia
	 * @return {@link Date} no começo do dia
	 */
	public static Date obterInicioData(final Date data) {
		return DateUtils.truncate(data, Calendar.DAY_OF_MONTH);
	}

	/**
	 * Adiciona uma quantidade de dias a data de tipo {@link Date} passada como parâmetro.
	 * 
	 * @param data
	 *            {@link Date} a data original
	 * @param quantidadeDias
	 *            {@link Integer} a quantidade de dias a ser adicionada
	 * @return {@link Date} a nova data resultado da operação
	 */
	public static Date adicionarDiasData(final Date data, final Integer quantidadeDias) {
		return DateUtils.addDays(data, quantidadeDias);
	}

	/**
	 * Adiciona uma quantidade de dias a data de tipo {@link Date} passada como parâmetro.
	 * 
	 * @param data
	 *            {@link Date} a data original
	 * @param quantidadeDias
	 *            {@link Integer} a quantidade de dias a ser adicionada
	 * @return {@link Date} a nova data resultado da operação
	 */
	public static Calendar adicionarDiasData(final Calendar data, final Integer quantidadeDias) {
		Date dataAdicionada = DateUtils.addDays(data.getTime(), quantidadeDias);
		Calendar resultado = Calendar.getInstance();
		resultado.setTime(dataAdicionada);
		return resultado;
	}

}
