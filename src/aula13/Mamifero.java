package aula13;

public class Mamifero extends Animal{
	//Atributos
	protected String CorPelo;
	
	//M�todos
	@Override
	public void emitirSom() {
		System.out.println("Som de animal");
	}
	
	//M�todos especiais
	public String getCorPelo() {
		return this.CorPelo;
	}
	public void setCorPelo(String cp) {
		this.CorPelo = cp;
	}
	
}
