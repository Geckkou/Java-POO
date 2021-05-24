package aula11;

public class Aluno extends Pessoa {
	//Atributos
	private int matricula;
	private String curso;
	
	//Métodos
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno: " + this.getNome());
	}
	
	@Override
	public String toString() {
		return "Aluno: \n[matricula = " + matricula + 
				"\ncurso = " + curso + 
				"\nnome = " + this.getNome()+ 
				"\nidade = " + this.getIdade() + 
				"\nsexo = " + this.getSexo() + "]" +
				"\n-----------------------------";
	}

	//Métodos especiais
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int ma) {
		this.matricula = ma;
	}
//--------------------------------------
	
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String cu) {
		this.curso = cu;
	}
//--------------------------------------
}
