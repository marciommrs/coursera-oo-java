package tarefa;

public class Respeitoso
  implements FormatadorNome {
  
  private boolean masculino;  
  
  public Respeitoso(boolean masculino) {
    this.masculino = masculino;
  }

  @Override
  public String formatarNome(String nome, String sobrenome) {
    if (this.masculino) {
      return TratamentoEnum.TRATAMENTO_SENHOR.getDescricao() + " " + sobrenome;
    }
    return TratamentoEnum.TRATAMENTO_SENHORA.getDescricao() + " " + sobrenome;
  }

}
