package tarefa.extra;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestePessoa {

  private static Relogio relogio;
  
  @BeforeClass
  public static void inicializaRelogio() {
    Calendar c = new GregorianCalendar();
    c.set(2016, Calendar.APRIL, 12);
    relogio = new Relogio(c.getTime());
    
  }
  
  @Test
  public void testSignoTouro() {
    Calendar c = new GregorianCalendar();
    c.set(1982, Calendar.APRIL, 30);
    Pessoa p2 = new Pessoa("Elmira", c.getTime());
    p2.setRelogio(relogio);
    
    assertEquals(33, p2.getIdade());
    assertEquals(SignoEnum.TOURO.getDescricao(), p2.getSigno());
  }
  
  @Test
  public void testSignoVirgem() {
    Calendar c = new GregorianCalendar();
    c.set(1980, Calendar.SEPTEMBER, 18);
    Pessoa pessoa = new Pessoa("Marcio", c.getTime());
    pessoa.setRelogio(relogio);
    
    assertEquals(35, pessoa.getIdade());
    assertEquals(SignoEnum.VIRGEM.getDescricao(), pessoa.getSigno());
  }
  
  @Test
  public void testSignoEscorpiao() {
    Calendar c = new GregorianCalendar();
    c.set(2014, Calendar.OCTOBER, 25);
    Pessoa pessoa = new Pessoa("Ludmila", c.getTime());
    pessoa.setRelogio(relogio);
    
    assertEquals(1, pessoa.getIdade());
    assertEquals(SignoEnum.ESCORPIAO.getDescricao(), pessoa.getSigno());
  }

}
