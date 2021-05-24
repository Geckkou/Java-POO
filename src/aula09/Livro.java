package aula09;

public class Livro implements Publicacao {
	//Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Construtor
	public Livro(String ti, String au,int to, Pessoa le) {
		setTitulo(ti);
		setAutor(au);
		setTotPaginas(to);
		setLeitor(le);
		this.pagAtual = 0;
		this.aberto = false;
	}
	
	//M�todos
	public String detalhes() {
		return "Livro {" + "titulo = " + this.titulo + 
				"\nautor = " + this.autor + 
				"\ntotal de p�ginas = " + this.totPaginas + 
				"\np�gina atual = " + this.pagAtual + 
				"\naberto = " + this.aberto + 
				"\nleitor = " + this.leitor.getNome() + "}" +
				"\n -----------------------------------------";
	}
	
	//M�todos especiais 
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String ti) {
		this.titulo = ti;
	}
//---------------------------------------------
	
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String au) {
		this.autor = au;
	}
//--------------------------------------------
	
	public int getTotPaginas() {
		return this.totPaginas;
	}
	public void setTotPaginas(int to) {
		this.totPaginas = to;
	}
//---------------------------------------------
	
	public int getPagAtual() {
		return this.pagAtual;
	}
	public void setPagAtual(int pa) {
		this.pagAtual = pa;
	}
//---------------------------------------------
	
	public boolean getAberto() {
		return this.aberto;
	}
	public void setAberto(boolean ab) {
		this.aberto = ab;
	}
//--------------------------------------------
	
	public Pessoa getLeitor() {
		return this.leitor;
	}
	public void setLeitor(Pessoa le) {
		this.leitor = le;
	}
//-------------------------------------------
	//M�todos da interface
	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if(this.getAberto()) {
			this.pagAtual = p;
		}if(p > this.totPaginas) {
			System.out.println("N�mero de p�ginas fora do limite.");
			this.pagAtual =0;
		}else {
			this.pagAtual = p;
		}if (this.aberto == false) {
			System.out.println("Impossivel folhear com o livro fechado.");
			this.pagAtual =0;
		}
	}

	@Override
	public void avançarPag() {
		if(this.getAberto()) {
		this.pagAtual++;
		}else {
			System.out.println("Livro fechado imposs�vel avan�ar.");
		}
	}

	@Override
	public void voltaPag() {
		if(this.getAberto()) {
		this.pagAtual--;
		}else {
			System.out.println("Livro fechado imposs�vel retroceder.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
