package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(1);
		Integer soma = 0;
		
		while(soma < 350) {
			soma = (Integer) lista.get(lista.size() - 1)
					+ (Integer) lista.get(lista.size() - 2);
			lista.add(soma);
		}
		return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}