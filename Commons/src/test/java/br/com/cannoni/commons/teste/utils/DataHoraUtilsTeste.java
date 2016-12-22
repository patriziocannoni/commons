package br.com.cannoni.commons.teste.utils;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cannoni.commons.utils.data.DataHoraUtils;

/**
 * Classe de teste com JUnit para os métodos da classe {@link DataHoraUtils}.
 * 
 * @author Patrizio
 * @since 01/12/2014
 */
public class DataHoraUtilsTeste {

	private Calendar dataAtualCalendar;

	@Before
	public void inicializar() {
		dataAtualCalendar = Calendar.getInstance();
	}

	@Test
	public void obterInicioDataAtual() {
		Calendar calendarAtualInicio = DataHoraUtils.obterInicioDataAtual();

		Assert.assertTrue(calendarAtualInicio.get(Calendar.YEAR) == dataAtualCalendar.get(Calendar.YEAR));
		Assert.assertTrue(calendarAtualInicio.get(Calendar.MONTH) == dataAtualCalendar.get(Calendar.MONTH));
		Assert.assertTrue(calendarAtualInicio.get(Calendar.DAY_OF_MONTH) == dataAtualCalendar
				.get(Calendar.DAY_OF_MONTH));

		Assert.assertTrue(calendarAtualInicio.get(Calendar.HOUR_OF_DAY) == 0);
		Assert.assertTrue(calendarAtualInicio.get(Calendar.MINUTE) == 0);
		Assert.assertTrue(calendarAtualInicio.get(Calendar.SECOND) == 0);
		Assert.assertTrue(calendarAtualInicio.get(Calendar.MILLISECOND) == 0);
	}

}
