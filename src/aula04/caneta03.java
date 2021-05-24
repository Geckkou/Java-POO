package aula04;

public class caneta03 {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public caneta03(String m,float p, String c,boolean t) {
		setModelo(m);
		setPonta(p);
		setCor(c);
		setTampada(t);
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}
	
	public void setTampada(boolean t) {
		this.tampada = t;
	}
	
	public void status () {
		System.out.println("Sobre a caneta: ");
		System.out.println("Tipo de modelo: " + getModelo());
		System.out.println("O tipo de ponta é: " + getPonta());
		System.out.println("A cor da caneta é: " + getCor());
		System.out.println("A caneta está tampada ? " + getTampada());
	}
	
	
}
