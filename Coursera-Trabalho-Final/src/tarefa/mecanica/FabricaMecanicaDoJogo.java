package tarefa.mecanica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FabricaMecanicaDoJogo {

  private static List<MecanicaDoJogo> listaMecanicasDeJogo;
  private static Map<TipoMecanicaJogo, MecanicaDoJogo> mapMecanicasDeJogo;
  
  private FabricaMecanicaDoJogo() {
  }
  
  public static MecanicaDoJogo getMecanicaDoJogo() {
    registrarMecanicasDeJogo();
    Collections.shuffle(listaMecanicasDeJogo);
    return listaMecanicasDeJogo.get(0);
  }
  
  public static MecanicaDoJogo getMecanicaDoJogo(TipoMecanicaJogo tipoMecanica) {
    registrarMecanicasDeJogo();
    return mapMecanicasDeJogo.get(tipoMecanica);
  }
  
  private static void registrarMecanicasDeJogo() {
    if (mapMecanicasDeJogo == null) {
      mapMecanicasDeJogo = new HashMap<>();
      mapMecanicasDeJogo.put(TipoMecanicaJogo.UNICA_TENTATIVA, new MecanicaTentativaUnica());
      mapMecanicasDeJogo.put(TipoMecanicaJogo.TRES_TENTATIVAS, new MecanicaTresTentativas());
      listaMecanicasDeJogo = new ArrayList<>(mapMecanicasDeJogo.values());
    }
  }
}
