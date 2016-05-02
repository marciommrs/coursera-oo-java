package tarefa.embaralhador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabricaEmbaralhadores {

  private static List<Embaralhador> embaralhadores;
  
  private FabricaEmbaralhadores() {
  }
  
  public static Embaralhador getEmbaralhador() {
    Collections.shuffle(getEmbaralhadores());
    return embaralhadores.get(0);
  }
  
  private static List<Embaralhador> getEmbaralhadores() {
    if (embaralhadores == null) {
      embaralhadores = new ArrayList<>();
      embaralhadores.add(new EmbaralhadorOrdemReversaValorNumeroLetra());
      embaralhadores.add(new EmbaralhadorVogalConsoante());
    }
    return embaralhadores;
  }
  
}
