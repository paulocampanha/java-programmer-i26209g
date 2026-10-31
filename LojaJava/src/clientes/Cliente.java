package clientes;

public class Cliente {

  private final int id;
  private final String nome;
  private final String email;
  private final String cidade;
  private final String estado;
  
  // Construtor
  public Cliente(int id, String nome, String email, String cidade,
  String estado) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.cidade = cidade;
    this.estado = estado;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @return the cidade
   */
  public String getCidade() {
    return cidade;
  }

  /**
   * @return the estado
   */
  public String getEstado() {
    return estado;
  }
  
  
  
}
