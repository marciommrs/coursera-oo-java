package tarefa;

public enum TratamentoEnum {

  TRATAMENTO_SENHOR("Sr."),
  TRATAMENTO_SENHORA("Sr.");
  
  private String descricao;
  
  private TratamentoEnum(String descricao) {
    this.descricao = descricao;
  }

  /**
   * Retorna o valor da propriedade descricao.
   * 
   * @return {@link #descricao}
   */
  public String getDescricao() {
    return descricao;
  }
}
