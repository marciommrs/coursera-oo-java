package tarefa.extra;

import java.util.Date;

public class Relogio {

  private Date data;
  private Date dataAgora;
  
  /**
   * Construtor.
   * @param dataAgora
   */
  public Relogio() {
  }
  
  /**
   * Construtor.
   * @param dataAgora
   */
  public Relogio(Date data) {
    this.data = data;
  }

  public Date agora() {
    if (data == null) {
      dataAgora = new Date(System.currentTimeMillis());
      return dataAgora;
    }
    return data;
  }

  /**
   * Configura o valor da propriedade agora.
   * 
   * @param agora atualiza {@link #agora}
   */
  public void setAgora(Date agora) {
    this.data = agora;
  }
}
