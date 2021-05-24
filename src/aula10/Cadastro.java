package aula10;

public class Cadastro {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//M�todos
	public void fazerAniv() {
		this.idade++;
	}
	
	@Override
	public String toString() {
		return "Cadastro: \n[nome = " + nome + 
				"\nidade = " + idade + 
				"\nsexo = " + sexo + "]" +
		"\n------------------------------------";
	}
	
	//M�todos especiais
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}
//-------------------------------------------
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
//-------------------------------------------
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String se) {
		this.sexo = se;
	}
//-------------------------------------------
}
