package cadastro.controller;

public class listaController {
	
	@FXML
	private Label lblTitulo = new Label();
	
	@FXML
	private Button btnSalvar = new Button();
	
	@FXML
	private Button btnEditar = new Button();
	
	@FXML
	private Button btnCancelar = new Button();
	
	@FXML
	private Button btnSair = new Button();
	
	@FXML
	private TableView<PessoaTabela> tvTabela;
	
	@FXML
	private TableColumn<PessoaTabela, String> tcNome;
	
	@FXML
	private TableColumn<PessoaTabela, Integer> tcIdade;
	
	public void initialize(URL location, ResourceBundle resource ) {
		
		listarPessoas();
	}
	
	// Criação de entidade para acesso ao banco de dados
	private PessoaDao pessoaDao = new PessoaDao();
	
	//Criação da Lista para salvar o que a entidade vai retornar do Banco de dados
	private List<Pessoa> pessoaList = pessoaDao.listPessoa();
	
	// ObservableList para carregar os dados e visualizar os mesmos
	private ObservableList<PessoaTabela> listPessoaTabela = FXCollections.observableArrayList();
	
		
	public void listarPessoas() {
		
		if(!listPessoaTabela.isEmpty()) {
			listPessoaTabela.clear();
			System.out.println("Limpou a Tabela");
		}
		
		for (Pessoa pessoa : pessoaList) {
			PessoaTabela p = new PessoaTabela(pessoa.getId(),pessoa.getNome(),pessoa.getIdade());
			listPessoaTabela.add(p);
		}
		
		tcNome.setCellValueFactory(new PropertyValueFactory<PessoaTabela, String>("nome"));
		tcIdade.setCellValueFactory(new PropertyValueFactory<PessoaTabela, Integer>("idade"));
		
		tvTabela.setItems(listPessoaTabela);
	}
}
