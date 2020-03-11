package br.fai.javacollections02;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}
	
	private Map<String, String> mapa = new HashMap<String, String>();
	// private Map<String, String> mapa = null;
	
	private void start() {
		
		adicionarItensNoMapa();
		exibirValorDoMapaPelaChave("PA");
		exibirValorDoMapaPelaChave("valor que não existe");
		iterarMapa();
		
	}
	
	private void adicionarItensNoMapa() {
		
		try {
			mapa.put("SRS", "Santa Rita do Sapucai");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceição dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			
			System.out.println("cheguei no fim do try");
			
		}catch (Exception e) {
			System.out.println("ocorreu uma exceção");
		}
		
		finally {
			System.out.println("cheguei no finally");
		}
	}
	
	private void exibirValorDoMapaPelaChave(String chave) {
		
		String valorDoItemNoMapa = mapa.get(chave);
		if (valorDoItemNoMapa == null || valorDoItemNoMapa.isEmpty()) {
			System.out.println("esta chave não" + "está presente no mapa: " + chave);
			}else {
		System.out.println("o valor dessa chave é: " + mapa.get(chave));
	}

}

	private void iterarMapa() {
		
		System.out.println(" ------- ");
		for(String chave: mapa.keySet()) {
			System.out.println("chave: " + chave + "| valor:" + mapa.get(chave));
		}
	}
