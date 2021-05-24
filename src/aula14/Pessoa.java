package aula14;

public abstract class Pessoa {
	//Atributos
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	//Construtor
	public Pessoa(String nome, int idade, String sexo) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		this.experiencia = 0;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Pessoa: \n[nome = " + this.nome + 
				"\nidade = " + this.idade + 
				"\nsexo = " + this.sexo + 
				"\nexperiencia = " + this.experiencia + "]" +
				"\n------------------------------------------";
	}

	//Métodos
	protected void ganharExp() {
		
	}

	//Métodos especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public float getExperiencia() {
		return this.experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
