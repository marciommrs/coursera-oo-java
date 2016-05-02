package tarefa.mecanica;

import tarefa.dao.BancoDePalavras;
import tarefa.embaralhador.Embaralhador;
import tarefa.embaralhador.FabricaEmbaralhadores;

public abstract class MecanicaDoJogo {

  private Embaralhador embaralhador;
  private BancoDePalavras banco;
  
  public void iniciar() throws Exception {
    embaralhador = FabricaEmbaralhadores.getEmbaralhador();
    banco = new BancoDePalavras();
  }

  /**
   * Verifica se o jogo terminou.
   * @return
   */
  public abstract boolean terminou();

  /**
   * Retorno a próxima palavra.
   * @return
   */
  public abstract String proximaPalavra();

  /**
   * Valida as tentativa de acerto da palavra;
   * @param tentativa
   * @return
   */
  public abstract boolean validarTentativa(String tentativa);

  /**
   * Verifica se é possível tentar novamente.
   * @return
   */
  public abstract boolean tentar();

  /**
   * Retorna a quantidade de respostas certas.
   * @return
   */
  public abstract int pontuacao();

  /**
   * Retorna a descrição do jogo.
   * @return
   */
  public abstract String getDescricaoJogo();

  /**
   * Retorna o valor da propriedade embaralhador.
   * 
   * @return {@link #embaralhador}
   */
  protected Embaralhador getEmbaralhador() {
    return embaralhador;
  }

  /**
   * Retorna o valor da propriedade banco.
   * 
   * @return {@link #banco}
   */
  protected BancoDePalavras getBanco() {
    return banco;
  }

  
}
