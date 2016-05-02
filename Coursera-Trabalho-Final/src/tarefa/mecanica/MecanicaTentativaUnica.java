package tarefa.mecanica;


public class MecanicaTentativaUnica 
  extends MecanicaDoJogo {
  
  private String palavra;
  private boolean terminou;
  private boolean acertou;
  
  private int totalPontos;
  private int tentativas;
  
  private static int TOTAL_TENTATIVAS = 1;

  
  /**
   * Verifica se o jogo terminou.
   * @return
   */
  @Override
  public boolean terminou() {
    if (getBanco().isPalavrasVazio() || terminou) {
      return true;
    }
    return false;
  }
  
  /**
   * Retorno a próxima palavra.
   * @return
   */
  @Override
  public String proximaPalavra() {
    zeraRodada();
    this.palavra = getBanco().getPalavra();
    return getEmbaralhador().embaralhar(this.palavra);
  }
  
  /**
   * Zera os contadores da rodada.
   */
  private void zeraRodada() {
    this.tentativas = 0;
    this.acertou = false;
  }
  
  /**
   * Valida as tentativa de acerto da palavra;
   * @param tentativa
   * @return
   */
  @Override
  public boolean validarTentativa(String tentativa) {
    boolean resposta = this.palavra.equals(tentativa);
    incrementaRodada(resposta);
    return resposta;
  }
  
  /**
   * Incrementa a quantidades de tentativas.
   */
  private void incrementaRodada(boolean respostaCerta) {
    if (respostaCerta) {
      this.totalPontos++;
      this.acertou = respostaCerta;
    } else {
      this.tentativas++;
    }
  }
  
  /**
   * Verifica se é possível tentar novamente.
   * @return
   */
  @Override
  public boolean tentar() {
    if (tentativas < TOTAL_TENTATIVAS || this.acertou) {
      return true;
    } else {
      this.terminou = true;
      return false;
    }
  }

  /**
   * Retorna a quantidade de respostas certas.
   * @return
   */
  @Override
  public int pontuacao() {
    return totalPontos;
  }

  /**
   * Retorna a descrição do jogo.
   * @return
   */
  @Override
  public String getDescricaoJogo() {
    return "O jogo basea-se em tentativa única.\n" +
      "Veja quantas palavras consegue acertar!";
  }

}
