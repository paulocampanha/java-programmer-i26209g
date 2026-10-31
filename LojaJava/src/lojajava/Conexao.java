/**
 * Essa classe faz a conexão com o banco de dados
 * MySQL
 */
package lojajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
  
  public static Connection conectar() throws SQLException {
    
    String url = "jdbc:mysql://localhost:3306/loja";
    String usuario = "root";
    String senha = "root";
    
    return DriverManager.getConnection(url, usuario, senha);
  }
}
