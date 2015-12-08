package br.com.novopacote;

public class AdicionandoOutraClasse {

	private String nome;
	private String cpf;
	private String descricao;

	public AdicionandoOutraClasse() {
	}

	public String getCpf() {
		return cpf;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome " + getNome() + ", CPF " + getCpf();
	}

}
