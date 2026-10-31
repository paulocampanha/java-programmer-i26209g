/**
 * Modulo de cadastro de clientes
 */
package clientes;

// Classes JDBC utilizadas para acessar o banco
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lojajava.Conexao;

public class CadastroCliente {
  
  // Declara compos de texto 
  private TextField txtNome;
  private TextField txtId;
  private TextField txtEmail;
  private TextField txtCidade;
  private TextField txtEstado;
  
  // Declara objetos do tipo Button
  private Button btnSalvar;
  private Button btnLimpar;
  private Button btnFechar;
  
  // Metodo responsável por criar e abrir o formulário
  public void abrir() {
    
    // Criar uma nova janela
    Stage janela = new Stage();
    
    // Definir o título da janela
    janela.setTitle("Cadastro de Clientes");
    
    // Criar os campos de texto
    txtId = new TextField();
    txtNome = new TextField();
    txtEmail = new TextField();
    txtCidade = new TextField();
    txtEstado = new TextField();
    
    // Impede que o usuário altere o ID
    // O ID será gerado automaticamento pelo MySQL
    txtId.setEditable(false);
    // Exibe uma dica no campo
    txtId.setPromptText("Automático");
    // Define a largura do campo
    txtId.setPrefWidth(100);
    
    txtNome.setPrefWidth(300);
    txtEmail.setPrefWidth(300);
    txtCidade.setPrefWidth(150);
    txtEstado.setPrefWidth(50);
    
    // Exibir dica de preenchimento
    txtNome.setPromptText("Digite o nome do cliente");
    txtEmail.setPromptText("Digite o e-mail do cliente");
    txtCidade.setPromptText("Digite a cidade do cliente");
    txtEstado.setPromptText("Digite o estado abreviado.");
    
    // Cria uma grade para organizar os rótulos e campos
    GridPane grade = new GridPane();
    
    // Definir o espaçamento Horizontal
    grade.setHgap(10);
    
    // Definir o espaçamento Vertical
    grade.setVgap(12);
    
    // Definir o espaço interno
    grade.setPadding(new Insets(15));
    
    //Adicionando o rótulo na coluna 0 e linha 0
    grade.add(new Label("ID:"), 0, 0);
    
    // Adicionando o campo na coluna 0 e linha 1
    grade.add(txtId, 1, 0);
    
    grade.add(new Label("Nome:"), 0, 1);
    grade.add(txtNome, 1, 1);
    
    grade.add(new Label("E-mail:"), 0, 2);
    grade.add(txtEmail, 1, 2);
    
    grade.add(new Label("Cidade:"), 0, 3);
    grade.add(txtCidade, 1, 3);
    
    grade.add(new Label("Estado:"), 0, 4);
    grade.add(txtEstado, 1, 4);
    
    // Criar os botões
    btnSalvar = new Button("Salvar");
    btnLimpar = new Button("Limpar");
    btnFechar = new Button("Fechar");
    
    // Definir ações do botões
    btnSalvar.setOnAction(event -> salvarCliente());
    btnLimpar.setOnAction(event -> limparFormulario());
    btnFechar.setOnAction(event -> janela.close());
    
    // Organizar os botões na horizontal
    HBox botoes = new HBox(10, btnSalvar, btnLimpar, btnFechar);
    
    // Centraliza os botões na horizontal
    botoes.setAlignment(Pos.CENTER);
    
    // Criar o layout principal
    VBox layout = new VBox(15, grade, botoes);
    
    // Definir espaçamento interno
    layout.setPadding(new Insets(10));
    
    // Criar a cena com 500 de largura e 350 de altura
    Scene cena = new Scene(layout, 500, 350);
    
    // Anexar a janela à cena
    janela.setScene(cena);
    
    // Impedir que o usuario redimensione a janela
    janela.setResizable(false);
    
    // Exibe a janela
    janela.show();    
        
  }

  private void salvarCliente() {
    
    // Recupera valores dos campos
    String nome = txtNome.getText().trim();
    String email = txtEmail.getText().trim();
    String cidade = txtCidade.getText().trim();
    String estado = txtEstado.getText().trim();
    
    // Verificar se o campo nome está vazio
    if (nome.isEmpty()) {
      // Mostrar mensagem
      mostrarAlerta(Alert.AlertType.WARNING,
              "Validação",
              "O nome do cliente é obrigatorio.");      
      // Interrompe o método
      return;
    }
    
    // Definir o comando SQL para inserir o novo cliente
    // no banco de dados
    String sql = "INSERT INTO clientes " +
            "(nome, email, cidade, estado) " +
            "VALUE (?,?,?,?)";
    
    // Abrir as conexões e preparar a instrução SQL
    try (
      Connection conexao = Conexao.conectar();
      // Solicita ao MySQL o chave gerada
      PreparedStatement comando = conexao.prepareStatement(
        sql, Statement.RETURN_GENERATED_KEYS
      )
    ) {
      //Preencher as '?' do comando SQL
      comando.setString(1, nome);
      comando.setString(2, email);
      comando.setString(3, cidade);
      comando.setString(4, estado);
      
      // Executa o INSERT e retorno a quantidade de linhas
      // afetadas
      int linhas = comando.executeUpdate();
      
      // Verifica se o registro foi inserido
      if (linhas > 0) {
        // Solicita a chave gerada no banco
        try (ResultSet chaves = comando.getGeneratedKeys()){
          // VEifica se o MYSQL retorou o ID
          if (chaves.next()) {
            // Exibir o ID no campo ID
            txtId.setText(String.valueOf(chaves.getInt(1)));
          }
        }
        // Mostrar uma mensagem de sucesso
        mostrarAlerta(Alert.AlertType.INFORMATION,
                "Sucesso", 
                "Cliente cadastrado com sucesso!\nID: "
                + txtId.getText());
        // Desabilita o botão Salvar para evitar um novo
        // envio acidental dos mesmos dados
        btnSalvar.setDisable(true);
      }      
    } catch (SQLException e) {
      mostrarAlerta(Alert.AlertType.ERROR,
            "Erro no banco de dados",
            e.getMessage());
    } 
  }

  private void limparFormulario() {
    // Limpar campos do formulário
    txtId.clear();
    txtNome.clear();
    txtEmail.clear();
    txtCidade.clear();
    txtEstado.clear();
    
    // Hsabilita o botão salvar
    btnSalvar.setDisable(false);
    
    // Posicionar o cursos no campo Nome
    txtNome.requestFocus();
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
