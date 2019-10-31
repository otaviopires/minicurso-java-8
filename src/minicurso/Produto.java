package minicurso;

public class Produto {
	private String nome;
	private Double preco;
	private boolean flgPossuiEstoque;
	private String categoria;
	private Integer qtdEstoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
		this.flgPossuiEstoque = qtdEstoque > 0;
	}
	public boolean getFlgPossuiEstoque () {
		return this.flgPossuiEstoque;
	}
}
