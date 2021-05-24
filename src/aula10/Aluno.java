package aula10;

public class Aluno extends Cadastro {
	//Atributos
	private int matr;
	private String curso;
	
	//Métodos
	public void cancelarMatr() {
		System.out.println("Sua matrícula foi cancela com sucesso.");
		this.matr = 0;
	}
	
	//Métodos especiais
	public int getMatr() {
		return this.matr;
	}
	public void setMatr(int ma) {
		this.matr = ma;
	}
//----------------------------------------
	
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String cu) {
		this.curso = cu;
	}
//----------------------------------------
}
