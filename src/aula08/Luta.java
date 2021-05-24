package aula08;
import java.util.Random;

import aula07.Lutador;

public class Luta {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//Métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && (l1 != l2)){
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	
	public void lutar() {
		
		if(this.getAprovada()) {
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();
				Random aleatorio = new Random();
					int vencedor = aleatorio.nextInt(3);
					
		switch(vencedor) {
		case 0: //empate
			System.out.println("Empatou");
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			break;
			
		case 1: //ganhou desafiado
			System.out.println("Vencedor: " + this.desafiado.getNome());
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			break;
			
		case 2: //ganhou desafiante
			System.out.println("Vencedor: " + this.desafiante.getNome());
			this.desafiado.perderLuta();
			this.desafiante.ganharLuta();
			break;
		}
		}else {
			System.out.println("Luta não pode acontecer.");
		}
	}
	
//-----------------------------------------
	//Métodos Especiais
	public Lutador getDesafiado(){
		return this.desafiado;
	}
	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}
//-----------------------------------------
										 
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador de) {
		this.desafiante = de;
	}
//-----------------------------------------
	
	public int getRounds() {
		return this.rounds;
	}
	public void setRounds(int ro) {
		this.rounds = ro;
	}
//----------------------------------------
	
	public boolean getAprovada() {
		return this.aprovada;
	}
	public void setAprovada(boolean ap) {
		this.aprovada =ap;
	}
//-----------------------------------------

}
