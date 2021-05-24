package aula10;

public class Funcionario extends Cadastro {
	//Atributos
	private String setor;
	private boolean trabalhando;
	
	//Métodos
	public void mudarTrabalho() {
		this.trabalhando = !this.trabalhando;
	}
	
	//Métodos especiais
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String se) {
		this.setor = se;
	}
//---------------------------------------
	
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	public void setTrabalhando(boolean tr) {
		this.trabalhando = tr;
	}
//---------------------------------------
}
