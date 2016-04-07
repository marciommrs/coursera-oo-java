package tarefa;

public class Produto {

  private String nome;
  private int codigo;
  private double preco;
  
  
  /**
   * Construtor.
   * @param codigo
   * @param nome
   * @param preco
   */
  public Produto(int codigo, String nome, double preco) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
    return result;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }
  
  
}
