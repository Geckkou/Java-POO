package aula05;
//atributos
public class banco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
//metodos especiais
	
	public banco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta(){
		return this.numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono =d;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float s) {
		this.saldo =s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean st) {
		this.status = st;
	}
//metodos-----------------------------------------------
	public void estadoAtual() {
		System.out.println("-------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: R$ " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	
	void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
			if("cc".equalsIgnoreCase(t)) {
				this.setSaldo(50);
			}else  if("cp".equalsIgnoreCase(t)){
				this.setSaldo(150);
			}
			System.out.println("Conta agora aberta.");
	}
	
	
	void fecharConta(){
		if(this.getSaldo() > 0) {
			System.out.println("A Conta possui dinheiro e não pode ser fechada.");
		} else if (this.getSaldo() < 0){
			System.out.println("Conta em débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}
	
	
	void depositar(float v) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado com sucesso na conta de " + this.getDono() + ".");
		}else {
			System.out.println("Impossível depositar.");
		}
	}
	
	void sacar(float v) {
		if(this.getStatus()) {
		if(this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque realizado na conta de " + this.getDono() +".");
		}else {
			System.out.println("Saldo insuficiente.");
		}
		}else {
			System.out.println("Conta fechada Impossível sacar.");
		}
	}
	
	void pagarMensal() {
		float v =0;
			if("cc".equalsIgnoreCase(tipo)) {
				v = 12;
			}else if ("cp".equalsIgnoreCase(tipo)) {
				v = 20;
			}
				if(this.getStatus()) {
					if(this.getSaldo() > v) {
						this.setSaldo(this.getSaldo() - v);
						System.out.println("Mensalidade paga com sucesso por " + this.getDono() +".");
					}else {
						System.out.println("Conta fechada impossívell pagar.");
					}
				
	}
	
	}
}

