package tarefa.extra;

import java.util.Calendar;
import java.util.GregorianCalendar;

public enum SignoEnum {
  ARIES("Áries", new GregorianCalendar(0, Calendar.MARCH, 21),  new GregorianCalendar(0, Calendar.APRIL, 20)),
  TOURO("Touro", new GregorianCalendar(0, Calendar.APRIL, 21),  new GregorianCalendar(0, Calendar.MAY, 20)),
  GEMEOS("Gêmeos", new GregorianCalendar(0, Calendar.MAY, 21),  new GregorianCalendar(0, Calendar.JUNE, 20)),
  CANCER("Câncer", new GregorianCalendar(0, Calendar.JUNE, 21),  new GregorianCalendar(0, Calendar.JULY, 21)),
  LEAO("Leão", new GregorianCalendar(0, Calendar.JULY, 22),  new GregorianCalendar(0, Calendar.AUGUST, 22)),
  VIRGEM("Virgem", new GregorianCalendar(0, Calendar.AUGUST, 23),  new GregorianCalendar(0, Calendar.SEPTEMBER, 22)),
  LIBRA("Libra", new GregorianCalendar(0, Calendar.SEPTEMBER, 23),  new GregorianCalendar(0, Calendar.OCTOBER, 22)),
  ESCORPIAO("Escorpião", new GregorianCalendar(0, Calendar.OCTOBER, 23),  new GregorianCalendar(0, Calendar.NOVEMBER, 21)),
  SAGITARIO("Sagitário", new GregorianCalendar(0, Calendar.NOVEMBER, 22),  new GregorianCalendar(0, Calendar.DECEMBER, 21)),
  CAPRICORNIO("Capricórnio", new GregorianCalendar(0, Calendar.DECEMBER, 22),  new GregorianCalendar(0, Calendar.JANUARY, 20)),
  AQUARIO("Aquário:", new GregorianCalendar(0, Calendar.JANUARY, 21),  new GregorianCalendar(0, Calendar.FEBRUARY, 19)),
  PEIXES("Peixes", new GregorianCalendar(0, Calendar.FEBRUARY, 20),  new GregorianCalendar(0, Calendar.MARCH, 20));
  
  private String descricao;
  private Calendar inicio;
  private Calendar fim;
  
  /**
   * Construtor.
   * @param descricao
   * @param inicio
   * @param fim
   */
  private SignoEnum(String descricao, Calendar inicio, Calendar fim) {
    this.descricao = descricao;
    this.inicio = inicio;
    this.fim = fim;
  }
  
  /*
   * Retorna o signo baseado da data.
   */
  public static SignoEnum getSignoEnumByCalendar(Calendar c) {
    
    SignoEnum signo = SignoEnum.ARIES;
    if (c != null) {
      int dia = c.get(Calendar.DAY_OF_MONTH);
      int mes = c.get(Calendar.MONTH);
      
      int diaSignoInicio = 0;
      int mesSignoInicio = 0;
      int diaSignoFim = 0;
      int mesSignoFim = 0;
      
      for (SignoEnum s : SignoEnum.values()) {
        diaSignoInicio = s.getInicio().get(Calendar.DAY_OF_MONTH); 
        mesSignoInicio = s.getInicio().get(Calendar.MONTH);    
        diaSignoFim = s.getFim().get(Calendar.DAY_OF_MONTH); 
        mesSignoFim = s.getFim().get(Calendar.MONTH);    
        
        if ((mes == mesSignoInicio && dia >= diaSignoInicio)
          || (mes == mesSignoFim && dia <= diaSignoFim)) {
          signo = s;
          break;
        }
      }
      
    }
    
    return signo;
  }

  /**
   * Retorna o valor da propriedade descricao.
   * 
   * @return {@link #descricao}
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * Retorna o valor da propriedade inicio.
   * 
   * @return {@link #inicio}
   */
  public Calendar getInicio() {
    return inicio;
  }

  /**
   * Retorna o valor da propriedade fim.
   * 
   * @return {@link #fim}
   */
  public Calendar getFim() {
    return fim;
  }
  

}
