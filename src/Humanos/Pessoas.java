package Humanos;

public class Pessoas {
	private String nome;
	private int id;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "ID: "+ this.id +"\nNome: "+this.nome+"\n";
	}
}
