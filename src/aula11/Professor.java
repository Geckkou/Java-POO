package aula11;

public class Professor extends Pessoa {
	//Atributos
	private String especialidade;
	private float salario;
	
	//M�todos
	public void receberAum(float au) {
		this.salario = this.getSalario() + au;
	}
	
	//M�todos especiais
	public String getEspecialidade() {
		return this.especialidade;
	}
	public void setEspecialidade(String es) {
		this.especialidade = es;
	}
//--------------------------------------------
	
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float sa) {
		this.salario = sa;
	}
//--------------------------------------------

}
