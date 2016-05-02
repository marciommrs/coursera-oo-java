package tarefa;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteAutoridade {

  private static Informal informal;
  private static Respeitoso respeitoso;
  private static ComTitulo comTitulo;
  
  @BeforeClass
  public static void inicializaFormatadores() {
    informal = new Informal();     
    respeitoso = new Respeitoso(true); 
    comTitulo = new ComTitulo("Magnífico");   
  }
  
  @Test
  public void testTratamentoInformal() {
    Autoridade autoridade = new Autoridade("Joaquim", "Barbosa", informal);
    assertEquals("Joaquim", autoridade.getTratamento());
  }
  
  @Test
  public void testTratamentoRespeitoso() {
    Autoridade autoridade = new Autoridade("Joaquim", "Barbosa", respeitoso);
    assertEquals("Sr. Barbosa", autoridade.getTratamento());
  }
  
  @Test
  public void testTratamentoComTitulo() {
    Autoridade autoridade = new Autoridade("Joaquim", "Barbosa", comTitulo);
    assertEquals("Magnífico Joaquim Barbosa", autoridade.getTratamento());
  }

}
