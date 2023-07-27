package Usuario;

import Equipamento.marca.Iphone;

public class Utilizador {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		
		System.out.println("Funções do Reprodutor musical");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		System.out.println("");
		
		System.out.println("Funções do Navegador na Internet");
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		System.out.println("");				
				
		System.out.println("Funções do Aparelho telefônico");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorrerioVoz();
		System.out.println("");
		
	}
}
