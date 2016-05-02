package tarefa.embaralhador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteEmbaralhadorOrdemReversaValorNumeroLetra {

  @Test
  public void testEmbaralhar() {
    EmbaralhadorOrdemReversaValorNumeroLetra embaralhador = new EmbaralhadorOrdemReversaValorNumeroLetra();
    assertEquals("aaejln", embaralhador.embaralhar("janela"));
  }

}
