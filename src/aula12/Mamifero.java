package aula12;

public class Mamifero extends Animal {
	//Atributos
	private String corPele;
	
	//M�todos
	@Override
	public void locomover() {
		System.out.println("Correndo.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ROARRRR !!!");
	}
	
	//M�todos especiais
	public String getCorPele() {
		return this.corPele;
	}
	public void setCorPele(String cp) {
		this.corPele = cp;
	}
}
