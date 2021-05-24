package aula12;

public class Ave extends Animal {
	//Atributos
	private String CorPena;
	
	//M�todos
	@Override
	public void locomover() {
		System.out.println("Voando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo fruta.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("PIPIPIPIPIPPI !!");
	}
	
	public void fazerNinho() {
		System.out.println("Criando um ninho.");
	}
	
	//M�todos especiais
	public String getCorPena() {
		return this.CorPena;
	}
	public void setCorPena(String cp) {
		this.CorPena = cp;
	}
}
