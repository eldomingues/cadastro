package cadastro.tabela;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PessoaTabela {
	
	// Variaveis a listar
	
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty nome;
	private final SimpleIntegerProperty idade;
	
	//Construtor da Classe PessoaTabela passando dados do tipo primitivo e 
	//convertendo em Tipo Integer da Classe javafx.*.*.Simple*Property
	
	public PessoaTabela(int id, String nome, int idade) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.idade = new SimpleIntegerProperty(idade);
	
	}
	
	//Metodos getters retornam SimpleInteger e SimpleString
	
	public int getId() {
		return id.get();
	}
	
	public int getIdade() {
		return idade.get();
	}
	
	public String getNome() {
		return nome.get();
	}
	
	
}
