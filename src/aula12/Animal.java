package aula12;

public abstract class Animal {
	//Atributos
	protected float peso;
	protected int idade;
	protected int membros;
	
	//m�todos abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	//m�todos especiais
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float pe) {
		this.peso = pe;
	}
//---------------------------------------
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int id) {
		this.idade = id;
	}
//---------------------------------------
	
	public int getMembros() {
		return this.membros;
	}
	public void setMembros(int me) {
		this.membros = me;
	}
//---------------------------------------

}
