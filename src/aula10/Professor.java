package aula10;

public class Professor extends Cadastro {
	//Atributos
	private String especialidade;
	private float salario;
	
	//M�todos
	public void receberAum(float re) {
		this.salario = this.getSalario() + re; 
	}
	
	//M�todos especiais
	public String getEspecialidade() {
		return this.especialidade;
	}
	public void setEspecialidade(String es) {
		this.especialidade = es;
	}
//-------------------------------------------------
	
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float sa) {
		this.salario = sa;
	}
//-------------------------------------------------
}
