package clientes;

// Classes JDBC utilizadas para acessar o banco
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lojajava.Conexao;

public class PesquisaCliente {
  
  // Campo para digitar o nome ou parte do nome do cliente
  private TextField txtNome;
  
  // Tabela que representa os clientes encontados
  private TableView<Cliente> tabelaClientes;
  
  // Lista obswervável que fornece os dados da tabel
  private ObservableList<Cliente> listaClientes;
  
  public void abrir() {
    
    Stage janela = new Stage();
    
    janela.setTitle("Pesquisa de Clientes");
    
    txtNome = new TextField();
    txtNome.setPromptText("Digite o nome do cliente");
    txtNome.setPrefWidth(300);
    
    Button btnPesquisar = new Button("Pesquisar");
    Button btnListarTodos = new Button("Listar Todos");
    Button btnFechar = new Button("Fechar");
    
    // Criar a tabela que exibiraos resultados
    tabelaClientes = new TableView<>();
    
    //Criar as colunas da tabela
    TableColumn<Cliente, Integer> colunaId = new TableColumn<>("ID"); 
    TableColumn<Cliente, String> colunaNome = new TableColumn<>("Nome");
    TableColumn<Cliente, String> colunaEmail = new TableColumn<>("E-mail");
    TableColumn<Cliente, String> colunaCidade = new TableColumn<>("Cidade");
    TableColumn<Cliente, String> colunaEstado = new TableColumn<>("Estado");
    
    // Definir a propriedade do objeto que alimentará a coluna
    colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
    colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
    colunaCidade.setCellValueFactory(new PropertyValueFactory<>("cidade"));
    colunaEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
    
    // Definir a largura da coluna
    colunaId.setPrefWidth(60);
    colunaNome.setPrefWidth(200);
    colunaEmail.setPrefWidth(200);
    colunaCidade.setPrefWidth(140);
    colunaEstado.setPrefWidth(50);
    
    // Adicionar as colunas à tabela
    tabelaClientes.getColumns().addAll(colunaId, colunaNome, 
            colunaEmail, colunaCidade, colunaEstado);
    
    // Criar a lista observável que armazena os clientes
    listaClientes = FXCollections.observableArrayList();
    
    // Associar a lista à tabela
    tabelaClientes.setItems(listaClientes);
    
    // Definir ações dos botões
    btnPesquisar.setOnAction(event -> pesquisar());
    btnListarTodos.setOnAction(event -> carregarClientes(null));
    btnFechar.setOnAction(event -> janela.close());
    
    // Permite pequisar pressionando o Enter no campo do nome
    txtNome.setOnAction(event -> pesquisar());
    
    HBox linhaPesquisa = new HBox(10, new Label("nome"), txtNome, 
      btnPesquisar, btnListarTodos, btnFechar);
    
    // Alinhaos componentes verticalmente ao centro
    linhaPesquisa.setAlignment(Pos.CENTER_LEFT);
    
    VBox layout = new VBox(15, linhaPesquisa, tabelaClientes);
    layout.setPadding(new Insets(15));
    
    // Permite que a tabela ocupe o espaço vertical disponível
    VBox.setVgrow(tabelaClientes, Priority.ALWAYS);
    
    Scene cena = new Scene(layout, 750, 450);
    
    janela.setScene(cena);
    janela.show();
    
    // Ao abrir o formulário, carrega todos os clientes
    carregarClientes(null);
  }
  
  private void carregarClientes(String nome) {
    
    String sql;
    
    if (nome == null) {
      sql = "SELECT * FROM clientes ORDER BY nome";
    } else {
      sql = "SELECT * FROM clientes WHERE nome LIKE ? ORDER BY nome";
    }
    
    // Limpa os resultados anteriores
    listaClientes.clear();
    
    try (Connection conexao = Conexao.conectar();
          PreparedStatement comando = conexao.prepareStatement(sql)){
      if (nome != null) {
        comando.setString(1, "%" + nome + "%");
      }
      // Executa o SELECT e recebe os reegistros encontrados
      try (ResultSet resultado = comando.executeQuery()) {
        
        // Percorre os registros retornados pelo MySQL
        while (resultado.next()) {
          int id = resultado.getInt("id_cliente");
          String nomeCliente = resultado.getString("nome");
          String email = resultado.getString("email");
          String cidade = resultado.getString("cidade");
          String estado = resultado.getString("estado");  
          
          Cliente cliente = new Cliente(id, nomeCliente, email, cidade, estado);
          
          // Adiciona o cliente à lista observável
          listaClientes.add(cliente);
        }
      }
      
      if (listaClientes.isEmpty()) {
        mostrarAlerta(Alert.AlertType.INFORMATION,
                "Pesquisa", "Nenhum cliente encontrado");
      }
    } catch (SQLException e) {
      mostrarAlerta(Alert.AlertType.ERROR,
              "Erro no banco de dados", e.getMessage());
    }
  }
  
  private void pesquisar() {
    
    String nome = txtNome.getText().trim();
    
    if (nome.isEmpty()) {
      carregarClientes(null);
    } else {
      carregarClientes(nome);
    }
  }
  
  private void mostrarAlerta(Alert.AlertType tipo, 
    String titulo, String mensagem) {
    
    // Criar a caixa de diálogo
    Alert alerta = new Alert(tipo);
    
    // Titulo da janela
    alerta.setTitle(titulo);
    
    // Remover o cabeçalho padrão da caixa de diálogo
    alerta.setHeaderText(null);
    
    // Definir o conteúdo da mensagem
    alerta.setContentText(mensagem);
    
    // Exibir a caixa de diálogo com a mensagem
    alerta.showAndWait();
  }
  
}
