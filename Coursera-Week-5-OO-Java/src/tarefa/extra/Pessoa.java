package tarefa.extra;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
  
  private String nome;
  private Date dataDeNascimento;
  private Relogio relogio;
  
  /**
   * Construtor.
   * @param nome
   * @param dataDeNascimento
   */
  public Pessoa(String nome, Date dataDeNascimento) {
    this.nome = nome;
    this.dataDeNascimento = dataDeNascimento;
  }

  public int getIdade() {
    Calendar agora = new GregorianCalendar();
    Calendar nascimento = new GregorianCalendar();
    
    int idade = 0;
    if(this.getDataDeNascimento() != null){
      agora.setTime(agora());
      nascimento.setTime(this.getDataDeNascimento());
      
      idade = getAno(agora) - getAno(nascimento);
      if(getMes(agora) < getMes(nascimento)) {
        idade--;
      } else {
        if(getDia(agora) < getDia(nascimento)) {
          idade--;
        }
      }
      
      if(idade < 0) {
        idade = 0;
      }
    }
    return (idade);     
  }
  
  public String getSigno() {
    Calendar nascimento = null;
    if (this.getDataDeNascimento() != null) {
      nascimento = new GregorianCalendar();
      nascimento.setTime(this.getDataDeNascimento());
    }
    return SignoEnum.getSignoEnumByCalendar(nascimento).getDescricao();

  }
  
  private int getDia(Calendar c) {
    return c.get(Calendar.DAY_OF_MONTH);
  }
  
  private int getMes(Calendar c) {
    return c.get(Calendar.MONTH) + 1;
  }
  
  private int getAno(Calendar c) {
    return c.get(Calendar.YEAR);
  }
  
  private Date agora() {
    if (relogio == null) {
      relogio = new Relogio();
    }
    return relogio.agora();
  }

  /**
   * Retorna o valor da propriedade dataDeNascimento.
   * 
   * @return {@link #dataDeNascimento}
   */
  public Date getDataDeNascimento() {
    return dataDeNascimento;
  }

  /**
   * Configura o valor da propriedade dataDeNascimento.
   * 
   * @param dataDeNascimento atualiza {@link #dataDeNascimento}
   */
  public void setDataDeNascimento(Date dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }

  /**
   * Configura o valor da propriedade relogio.
   * 
   * @param relogio atualiza {@link #relogio}
   */
  public void setRelogio(Relogio relogio) {
    this.relogio = relogio;
  }

  /**
   * Retorna o valor da propriedade nome.
   * 
   * @return {@link #nome}
   */
  public String getNome() {
    return nome;
  }

}
