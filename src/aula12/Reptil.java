package aula12;

public class Reptil extends Animal{
	//Atributos
	private String corEscama;
	
	//M�todos
	@Override
	public void locomover() {
		System.out.println("Rastejando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo minhoca.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("RINRINRINRIN !!!");
	}
	
	//M�todos especias
	public String getCorEscama() {
		return this.corEscama;
	}
	public void setCorEscama(String ce) {
		this.corEscama = ce;
	}
}
