package Materiais;

public class Materiais {
	private String nome;
	private int qntd;
	private String humano;

	public Materiais(String nome, int qntd) {
		this.nome = nome;
		this.qntd = qntd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	
	public String getHumano() {
		return humano;
	}

	public void setHumano(String humano) {
		this.humano = humano;
	}
}
