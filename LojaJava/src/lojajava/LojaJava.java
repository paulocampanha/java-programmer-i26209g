/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lojajava;

import clientes.AlterarCliente;
import clientes.CadastroCliente;
import clientes.PesquisaCliente;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sn1085640
 */
public class LojaJava extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    
    // Criar a barra de menu
    MenuBar barraMenu = new MenuBar();
    
    // Menu Clientes
    Menu menuClientes = new Menu("Clientes");
    
    // Criar a opção cadastrar cliente
    MenuItem itemCadastrarCliente = 
            new MenuItem("Cadastrar");
    // Definir ação do menu
    itemCadastrarCliente.setOnAction(event -> {
      CadastroCliente cadastro = new CadastroCliente();
      cadastro.abrir();
    });
    
    // Criar a opção altera cliente
    MenuItem itemAlterarCliente = 
            new MenuItem("Alterar");
    itemAlterarCliente.setOnAction(event -> {
      AlterarCliente alterar = new AlterarCliente();
      alterar.abrir();
    }
      
    );
    
    // Criar a opção pesquisar cliente
    MenuItem itemPesquisarCliente = 
            new MenuItem("Pesquisar");
    itemPesquisarCliente.setOnAction(event -> {
         PesquisaCliente pesquisa = new PesquisaCliente();
         pesquisa.abrir();
    });
    
    // Criar a opção excluir cliente
    MenuItem itemExcluirCliente = 
            new MenuItem("Excluir");
    itemExcluirCliente.setOnAction(event -> 
      mostrarMensagem("Cliente",
                    "Opção Excluir selecionada")
    );
    
    // Adiciona as quatro opções ao menu Cliente
    menuClientes.getItems().addAll(
            itemCadastrarCliente,
            itemAlterarCliente,
            itemPesquisarCliente,
            itemExcluirCliente
    );
    
   
    // Outros Menus
    //=========================================
    
    // Adiciona menu a barra principal
    barraMenu.getMenus().addAll(
            menuClientes
    ); 
    
    
    // Area central da Janela
    // Texto de boas vimdas
    Label mensagemInicial = 
      new Label("Bem-vindo ao Sistema Loja Java");
    
    // Definir o tamanho da fonte
    mensagemInicial.setStyle("-fx-font-size: 22px;");
    
    BorderPane layout = new BorderPane();
    
    // Posiciona a barra de menu no top da janela
    layout.setTop(barraMenu);
    
    // Posiciona a mensagem no centro
    layout.setCenter(mensagemInicial);
                
    // Cria a cena com o layout e suas 
    // dimensões iniciais    
    Scene cena = new Scene(layout, 800, 500);
    
    
    // Define título da janela
    primaryStage.setTitle("Sistema Loja Java");
    
    // Associa a cena à janela principal
    primaryStage.setScene(cena);
    
    // Exibe a janela na tela
    primaryStage.show();
  }
  
  // Método para exibir mensagem
  private void mostrarMensagem(
          String titulo, String mensagem) {
    // Criar uma caixa de dialogo
    Alert alerta = 
            new Alert(Alert.AlertType.INFORMATION);
    
    // Definir o titulo da janela
    alerta.setTitle(titulo);
    
    // Define o cabeçalho da mensagem
    alerta.setHeaderText(null);
    
    // Define o texto da janela
    alerta.setContentText(mensagem);
    
    //Exibir a caixa de dialogo
    alerta.showAndWait();
  }


  public static void main(String[] args) {
    launch(args);
  }
  
}
