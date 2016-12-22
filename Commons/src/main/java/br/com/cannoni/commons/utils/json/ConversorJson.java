package br.com.cannoni.commons.utils.json;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Classe responsável para converter JSON para Objetos (deserialização) e Objetos para JSON (serialização).
 * 
 * @author Patrizio
 * @since 25/07/2014
 */
public class ConversorJson<T extends Object> {

	/**
	 * Construtor.
	 */
	public ConversorJson() {
		super();
	}

	/**
	 * Converte uma string JSON para um objeto de tipo T.
	 * 
	 * @param jsonString
	 *            a String JSON
	 * @param clazz
	 *            A classe do objeto a ser criado a partir da string JSON
	 * @return T o objeto populado
	 */
	public T converterJsonParaObjeto(String jsonString, Class<T> clazz) {
		Gson gson = new Gson();
		return gson.fromJson(jsonString, clazz);
	}

	/**
	 * Converte uma String json para uma lista de objetos do tipo <T> passado.
	 * 
	 * @param jsonString
	 *            a String json
	 * @param clazz
	 *            o tipo dos objetos da lista
	 * @return List<T>
	 */
	@SuppressWarnings("unchecked")
	public List<T> conveterJsonParaLista(String jsonString, Class<T> clazz) {
		List<T> listaRetorno = new ArrayList<T>();

		Gson gson = new Gson();
		TypeToken<List<T>> typeToken = new TypeToken<List<T>>() {
		};
		List<T> listaGson = gson.fromJson(jsonString, typeToken.getType());

		for (Object elemento : listaGson) {
			try {
				T instancia = clazz.newInstance();
				BeanUtils.populate(instancia, (Map<String, Object>) elemento);
				listaRetorno.add(instancia);

			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return listaRetorno;
	}

}
