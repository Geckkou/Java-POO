package aula12;

public class Peixe extends Animal {
	//Atributos
	private String corEscama;
	
	//Métodos 
	@Override
	public void locomover() {
		System.out.println("Nadando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo algas.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("POPOPOPOPOP !!");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha.");
	}
	
	//Métodos especiais
	public String getCorEscama() {
		return this.corEscama;
	}
	public void setCorEscama(String cee) {
		this.corEscama = cee;
	}
}
