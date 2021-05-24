package aula11;

public class Tecnico extends Aluno {
	//Atributos
	private int registroProfissional;
	
	//Métodos
	public void praticar() {
		System.out.println("O aluno: " + this.getNome() + " está praticando.");
	}
	
	//métodos especiais
	public int getRegistroProfissional() {
		return this.registroProfissional;
	}
	public void setRegistroProfissional(int rp) {
		this.registroProfissional = rp;
	}
}
