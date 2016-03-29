package exemplo.pontuacao;


public class RegistraPonto {
  
  private CalculadoraBonus bonus;
  
  public RegistraPonto(CalculadoraBonus cb) {
    this.bonus = cb;
  }

  public void fazerUmComentario(Usuario u) {
    u.pontos += 3 * bonus.bonus(u);
  }
  
  public void criarUmTopico(Usuario u) {
    u.pontos += 5 * bonus.bonus(u);
  }
  
  public void darUmLike(Usuario u) {
    u.pontos += 1 * bonus.bonus(u);
  }
  
  
}
