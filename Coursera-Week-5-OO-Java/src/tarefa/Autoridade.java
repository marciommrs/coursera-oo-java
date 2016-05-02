package tarefa;

public class Autoridade {

  private String nome;
  private String sobrenome;
  private FormatadorNome formatadorNome;
  
  /**
   * Construtor.
   * @param nome
   * @param sobrenome
   * @param formatadorNome
   */
  public Autoridade(String nome, String sobrenome,
                    FormatadorNome formatadorNome) {
    super();
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.formatadorNome = formatadorNome;
  }

  public String getTratamento() {
    return formatadorNome.formatarNome(nome, sobrenome);
  }
}
