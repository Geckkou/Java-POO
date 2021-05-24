package aula11;

public abstract class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Métodos
	public final void fazerAniv() {
		this.idade++;
	}
	
	//Tostring
	@Override
	public String toString() {
		return "Dados: \n[nome = " + nome + 
				"\nidade = " + idade + 
				"\nsexo = " + sexo + "]" +
				"\n-----------------------------";
	}

	//Métodos especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
//-----------------------------------------
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
//-----------------------------------------
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String se) {
		this.sexo = se;
	}
//-----------------------------------------
	
}
