package aula11;

public class Bolsista extends Aluno {
	//Atributos
	private float bolsa;
	
	//M�todos
	public void renovarBolsa() {
		System.out.println("Bolsa do aluno: " + this.getNome() + " renovada.");
	}
	
	@Override
	public String toString() {
		return "Aluno: \n[matricula = " + this.getMatricula() + 
				"\ncurso = " + this.getCurso() + 
				"\nnome = " + this.getNome()+ 
				"\nidade = " + this.getIdade() + 
				"\nsexo = " + this.getSexo() + "]" +
				"\nbolsa = " + this.bolsa + 
				"\n-----------------------------";
	}

	//M�todos especiais
	public float getBolsa() {
		return this.bolsa;
	}
	public void setBolsa(float ba) {
		this.bolsa = ba;
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " � bolsista ! Pagamento facilitado.");
	}
}
