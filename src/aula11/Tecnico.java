package aula11;

public class Tecnico extends Aluno {
	//Atributos
	private int registroProfissional;
	
	//M�todos
	public void praticar() {
		System.out.println("O aluno: " + this.getNome() + " est� praticando.");
	}
	
	//m�todos especiais
	public int getRegistroProfissional() {
		return this.registroProfissional;
	}
	public void setRegistroProfissional(int rp) {
		this.registroProfissional = rp;
	}
}
