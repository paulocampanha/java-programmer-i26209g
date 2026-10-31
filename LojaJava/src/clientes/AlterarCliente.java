package clientes; // Define o pacote da aplicação.

// Importa as classes JDBC para acessar o MySQL.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Importa os componentes visuais JavaFX.
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;

// Importa a coleção observável utilizada pela tabela.
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// Importa os layouts da interface.
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// Importa configurações de espaçamento e alinhamento.
import javafx.geometry.Insets;
import javafx.geometry.Pos;

// Importa a classe que representa a janela.
import javafx.stage.Stage;
import lojajava.Conexao;


// Declara a classe responsável pela alteração de clientes.
public class AlterarCliente {

    // Campo para pesquisar clientes pelo nome.
    private TextField txtPesquisa;

    // Campos que apresentarão os dados do cliente selecionado.
    private TextField txtId;
    private TextField txtNome;
    private TextField txtEmail;
    private TextField txtCidade;

    // Tabela que exibirá os clientes encontrados.
    private TableView<Cliente> tabelaClientes;

    // Lista observável que alimentará a tabela.
    private ObservableList<Cliente> listaClientes;

    // Método que cria e abre o formulário.
    public void abrir() {

        // Cria a janela da aplicação.
        Stage janela = new Stage();

        // Define o título da janela.
        janela.setTitle("Alterar Clientes");

        // Cria o campo de pesquisa.
        txtPesquisa = new TextField();

        // Define a dica do campo de pesquisa.
        txtPesquisa.setPromptText("Digite o nome do cliente");

        // Define a largura do campo de pesquisa.
        txtPesquisa.setPrefWidth(250);

        // Cria os campos do formulário.
        txtId = new TextField();
        txtNome = new TextField();
        txtEmail = new TextField();
        txtCidade = new TextField();

        // O ID não poderá ser alterado pelo usuário.
        txtId.setEditable(false);

        // Define as larguras dos campos.
        txtId.setPrefWidth(100);
        txtNome.setPrefWidth(300);
        txtEmail.setPrefWidth(300);
        txtCidade.setPrefWidth(200);

        // Cria a tabela de clientes.
        tabelaClientes = new TableView<>();

        // Cria a coluna ID.
        TableColumn<Cliente, Integer> colunaId =
            new TableColumn<>("ID");

        // Associa a coluna à propriedade id da classe Cliente.
        colunaId.setCellValueFactory(
            new PropertyValueFactory<>("id")
        );

        // Define a largura da coluna ID.
        colunaId.setPrefWidth(60);

        // Cria a coluna Nome.
        TableColumn<Cliente, String> colunaNome =
            new TableColumn<>("Nome");

        // Associa a coluna à propriedade nome.
        colunaNome.setCellValueFactory(
            new PropertyValueFactory<>("nome")
        );

        // Define a largura da coluna Nome.
        colunaNome.setPrefWidth(200);

        // Cria a coluna E-mail.
        TableColumn<Cliente, String> colunaEmail =
            new TableColumn<>("E-mail");

        // Associa a coluna à propriedade email.
        colunaEmail.setCellValueFactory(
            new PropertyValueFactory<>("email")
        );

        // Define a largura da coluna E-mail.
        colunaEmail.setPrefWidth(200);

        // Cria a coluna Cidade.
        TableColumn<Cliente, String> colunaCidade =
            new TableColumn<>("Cidade");

        // Associa a coluna à propriedade cidade.
        colunaCidade.setCellValueFactory(
            new PropertyValueFactory<>("cidade")
        );

        // Define a largura da coluna Cidade.
        colunaCidade.setPrefWidth(150);

        // Adiciona as colunas à tabela.
        tabelaClientes.getColumns().addAll(
            colunaId,
            colunaNome,
            colunaEmail,
            colunaCidade
        );

        // Cria a lista observável de clientes.
        listaClientes = FXCollections.observableArrayList();

        // Associa a lista à tabela.
        tabelaClientes.setItems(listaClientes);

        // Cria o botão Pesquisar.
        Button btnPesquisar = new Button("Pesquisar");

        // Cria o botão Listar Todos.
        Button btnListarTodos = new Button("Listar Todos");

        // Cria o botão para carregar o cliente selecionado.
        Button btnCarregar = new Button("Carregar Selecionado");

        // Cria o botão para salvar as alterações.
        Button btnSalvar = new Button("Salvar Alterações");

        // Cria o botão para limpar os campos.
        Button btnLimpar = new Button("Limpar");

        // Cria o botão para fechar a janela.
        Button btnFechar = new Button("Fechar");

        // Define a ação do botão Pesquisar.
        btnPesquisar.setOnAction(event -> pesquisar());

        // Define a ação do botão Listar Todos.
        btnListarTodos.setOnAction(
            event -> carregarClientes(null)
        );

        // Define a ação para carregar os dados selecionados.
        btnCarregar.setOnAction(
            event -> carregarSelecionado()
        );

        // Define a ação para salvar as alterações no banco.
        btnSalvar.setOnAction(
            event -> salvarAlteracoes()
        );

        // Define a ação para limpar os campos.
        btnLimpar.setOnAction(
            event -> limparFormulario()
        );

        // Define a ação para fechar a janela.
        btnFechar.setOnAction(
            event -> janela.close()
        );

        // Permite pesquisar pressionando Enter.
        txtPesquisa.setOnAction(event -> pesquisar());

        // Organiza o campo de pesquisa e seus botões.
        HBox linhaPesquisa = new HBox(
            10,
            new Label("Pesquisar nome:"),
            txtPesquisa,
            btnPesquisar,
            btnListarTodos
        );

        // Alinha os componentes da pesquisa.
        linhaPesquisa.setAlignment(Pos.CENTER_LEFT);

        // Cria a grade do formulário de alteração.
        GridPane grade = new GridPane();

        // Define o espaçamento horizontal.
        grade.setHgap(10);

        // Define o espaçamento vertical.
        grade.setVgap(10);

        // Define o espaçamento interno.
        grade.setPadding(new Insets(10));

        // Adiciona os rótulos e campos na grade.
        grade.add(new Label("ID:"), 0, 0);
        grade.add(txtId, 1, 0);

        grade.add(new Label("Nome:"), 0, 1);
        grade.add(txtNome, 1, 1);

        grade.add(new Label("E-mail:"), 0, 2);
        grade.add(txtEmail, 1, 2);

        grade.add(new Label("Cidade:"), 0, 3);
        grade.add(txtCidade, 1, 3);

        // Organiza os botões de operação horizontalmente.
        HBox botoes = new HBox(
            10,
            btnCarregar,
            btnSalvar,
            btnLimpar,
            btnFechar
        );

        // Centraliza os botões.
        botoes.setAlignment(Pos.CENTER);

        // Cria o layout principal da janela.
        VBox layout = new VBox(
            12,
            linhaPesquisa,
            new Label("Selecione um cliente na tabela:"),
            tabelaClientes,
            grade,
            botoes
        );

        // Define o espaçamento interno do layout.
        layout.setPadding(new Insets(15));

        // Permite que a tabela ocupe o espaço vertical disponível.
        VBox.setVgrow(
            tabelaClientes,
            javafx.scene.layout.Priority.ALWAYS
        );

        // Cria a cena com largura de 850 e altura de 650 pixels.
        Scene cena = new Scene(layout, 850, 650);

        // Associa a cena à janela.
        janela.setScene(cena);

        // Exibe a janela.
        janela.show();

        // Carrega todos os clientes ao abrir o formulário.
        carregarClientes(null);
    }

    // Executa a pesquisa pelo nome informado.
    private void pesquisar() {

        // Recupera o texto digitado e remove espaços externos.
        String nome = txtPesquisa.getText().trim();

        // Se o campo estiver vazio, lista todos os clientes.
        if (nome.isEmpty()) {
            carregarClientes(null);
        } else {
            // Caso contrário, pesquisa pelo nome informado.
            carregarClientes(nome);
        }
    }

    // Consulta os clientes no MySQL e atualiza a tabela.
    private void carregarClientes(String nome) {

        // Declara a variável que armazenará a consulta SQL.
        String sql;

        // Verifica se a consulta deve retornar todos os clientes.
        if (nome == null) {

            // Consulta todos os clientes, ordenados pelo nome.
            sql = "SELECT id, nome, email, cidade "
                + "FROM clientes ORDER BY nome";

        } else {

            // Consulta clientes cujo nome contém o texto informado.
            sql = "SELECT id, nome, email, cidade "
                + "FROM clientes WHERE nome LIKE ? ORDER BY nome";
        }

        // Remove os registros da consulta anterior.
        listaClientes.clear();

        // Abre a conexão e prepara o comando SQL.
        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement comando =
                conexao.prepareStatement(sql)
        ) {

            // Define o parâmetro da pesquisa quando necessário.
            if (nome != null) {

                // Os símbolos % permitem encontrar o texto
                // em qualquer posição do nome do cliente.
                comando.setString(1, "%" + nome + "%");
            }

            // Executa a consulta e recebe os registros encontrados.
            try (ResultSet resultado = comando.executeQuery()) {

                // Percorre todos os registros retornados.
                while (resultado.next()) {

                    // Recupera o ID do cliente.
                    int id = resultado.getInt("id");

                    // Recupera o nome do cliente.
                    String nomeCliente =
                        resultado.getString("nome");

                    // Recupera o e-mail do cliente.
                    String email =
                        resultado.getString("email");

                    // Recupera a cidade do cliente.
                    String cidade =
                        resultado.getString("cidade");

                    // Cria um objeto com os dados do cliente.
                    Cliente cliente = new Cliente(
                        id,
                        nomeCliente,
                        email,
                        cidade,
                        ""
                    );

                    // Adiciona o cliente à lista da tabela.
                    listaClientes.add(cliente);
                }
            }

            // Informa se nenhum cliente foi encontrado.
            if (listaClientes.isEmpty()) {
                mostrarAlerta(
                    Alert.AlertType.INFORMATION,
                    "Pesquisa",
                    "Nenhum cliente encontrado."
                );
            }

        } catch (SQLException e) {

            // Apresenta os detalhes caso ocorra um erro SQL.
            mostrarAlerta(
                Alert.AlertType.ERROR,
                "Erro no banco de dados",
                e.getMessage()
            );
        }
    }

    // Copia os dados do cliente selecionado para os campos.
    private void carregarSelecionado() {

        // Obtém o cliente selecionado na tabela.
        Cliente cliente =
            tabelaClientes.getSelectionModel().getSelectedItem();

        // Verifica se algum cliente foi selecionado.
        if (cliente == null) {

            // Informa que é necessário selecionar um registro.
            mostrarAlerta(
                Alert.AlertType.WARNING,
                "Seleção",
                "Selecione um cliente na tabela."
            );

            // Interrompe o método.
            return;
        }

        // Preenche o campo ID com o identificador selecionado.
        txtId.setText(String.valueOf(cliente.getId()));

        // Preenche o campo Nome.
        txtNome.setText(cliente.getNome());

        // Preenche o campo E-mail.
        txtEmail.setText(cliente.getEmail());

        // Preenche o campo Cidade.
        txtCidade.setText(cliente.getCidade());
    }

    // Atualiza os dados do cliente no banco.
    private void salvarAlteracoes() {

        // Recupera o ID do cliente que será alterado.
        String idTexto = txtId.getText().trim();

        // Recupera os novos valores dos campos.
        String nome = txtNome.getText().trim();
        String email = txtEmail.getText().trim();
        String cidade = txtCidade.getText().trim();

        // Verifica se um cliente foi carregado.
        if (idTexto.isEmpty()) {

            // Informa que é necessário selecionar um cliente.
            mostrarAlerta(
                Alert.AlertType.WARNING,
                "Validação",
                "Selecione e carregue um cliente antes de alterar."
            );

            // Interrompe o método.
            return;
        }

        // Verifica se o nome foi preenchido.
        if (nome.isEmpty()) {

            // Exibe um aviso para o usuário.
            mostrarAlerta(
                Alert.AlertType.WARNING,
                "Validação",
                "O nome do cliente é obrigatório."
            );

            // Interrompe o método sem atualizar o banco.
            return;
        }

        // Define o comando SQL para atualizar o cliente.
        // O ID identifica exatamente o registro que será alterado.
        String sql = """
            UPDATE clientes
            SET nome = ?, email = ?, cidade = ?
            WHERE id = ?
            """;

        // Abre a conexão e prepara a instrução SQL.
        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement comando =
                conexao.prepareStatement(sql)
        ) {

            // Define o novo nome do cliente.
            comando.setString(1, nome);

            // Define o novo e-mail do cliente.
            comando.setString(2, email);

            // Define a nova cidade do cliente.
            comando.setString(3, cidade);

            // Define o ID do registro que será atualizado.
            comando.setInt(4, Integer.parseInt(idTexto));

            // Executa o UPDATE e obtém a quantidade de linhas afetadas.
            int linhas = comando.executeUpdate();

            // Verifica se algum registro foi atualizado.
            if (linhas > 0) {

                // Informa que a alteração foi concluída.
                mostrarAlerta(
                    Alert.AlertType.INFORMATION,
                    "Sucesso",
                    "Cliente alterado com sucesso!"
                );

                // Atualiza a tabela para mostrar os novos valores.
                carregarClientes(null);

                // Limpa os campos do formulário.
                limparFormulario();

            } else {

                // Informa que nenhum registro foi alterado.
                mostrarAlerta(
                    Alert.AlertType.INFORMATION,
                    "Resultado",
                    "Nenhum registro foi alterado."
                );
            }

        } catch (SQLException e) {

            // Trata erros ocorridos durante o UPDATE.
            mostrarAlerta(
                Alert.AlertType.ERROR,
                "Erro ao alterar cliente",
                e.getMessage()
            );

        } catch (NumberFormatException e) {

            // Trata um eventual problema na conversão do ID.
            mostrarAlerta(
                Alert.AlertType.ERROR,
                "Erro",
                "O ID informado não é válido."
            );
        }
    }

    // Limpa os campos do formulário.
    private void limparFormulario() {

        // Limpa o ID.
        txtId.clear();

        // Limpa o nome.
        txtNome.clear();

        // Limpa o e-mail.
        txtEmail.clear();

        // Limpa a cidade.
        txtCidade.clear();

        // Limpa o campo de pesquisa.
        txtPesquisa.clear();

        // Remove a seleção atual da tabela.
        tabelaClientes.getSelectionModel().clearSelection();
    }

    // Método auxiliar para exibir mensagens ao usuário.
    private void mostrarAlerta(
        Alert.AlertType tipo,
        String titulo,
        String mensagem
    ) {

        // Cria a caixa de diálogo do tipo solicitado.
        Alert alerta = new Alert(tipo);

        // Define o título da janela.
        alerta.setTitle(titulo);

        // Remove o cabeçalho padrão.
        alerta.setHeaderText(null);

        // Define o conteúdo da mensagem.
        alerta.setContentText(mensagem);

        // Exibe a mensagem e aguarda seu fechamento.
        alerta.showAndWait();
    }

    
}