package aula09;

public class Pessoa {
	
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Construtor
	public Pessoa(String no, int id, String se) {
		setNome(no);
		setIdade(id);
		setSexo(se);
	}
	
	//Métodos
	public void fazerAniver() {
		this.idade++;
	}
	
	public void resumoPessoa() {
		System.out.println("Idade do Leitor: " + this.getIdade());
		System.out.println("Nome do leitor: " + this.getNome());
		System.out.println("Sexo do leitor: " +this.getSexo());
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
//----------------------------------------
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String se) {
		this.sexo = se;
	}
}
