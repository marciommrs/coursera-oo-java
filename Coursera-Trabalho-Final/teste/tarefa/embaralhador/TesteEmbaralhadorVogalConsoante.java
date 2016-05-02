package tarefa.embaralhador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteEmbaralhadorVogalConsoante {

  @Test
  public void testEmbaralhar() {
    EmbaralhadorVogalConsoante embaralhador = new EmbaralhadorVogalConsoante();
    assertEquals("ajenal", embaralhador.embaralhar("janela"));
  }

}
