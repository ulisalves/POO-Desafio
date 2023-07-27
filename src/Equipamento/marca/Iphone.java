package Equipamento.marca;

import Equipamento.navegador.NavegadorNaInternet;
import Equipamento.reprodutor.RepodutorMusicial;
import Equipamento.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorNaInternet, RepodutorMusicial, AparelhoTelefonico {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
	}

	@Override
	public void pausar() {
		System.out.println("Paunsando");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecioando música");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Correio de voz");
	}

}
