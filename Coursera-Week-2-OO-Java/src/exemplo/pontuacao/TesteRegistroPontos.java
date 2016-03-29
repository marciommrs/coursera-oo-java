package exemplo.pontuacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRegistroPontos {

  @Test
  public void pontosCriarTopico() {
    Usuario u = new Usuario();
    u.nome = "Guerra";
    CalculadoraBonus cb = new CalculadoraBonus();
    RegistraPonto rp = new RegistraPonto(cb);
    rp.criarUmTopico(u);
    assertEquals(u.pontos, 5);
  }
  
  @Test
  public void pontosCriarTopicoVIP() {
    Usuario u = new Usuario();
    u.nome = "Guerra";
    u.vip = true;
    CalculadoraBonus cb = new CalculadoraBonus();
    RegistraPonto rp = new RegistraPonto(cb);
    rp.criarUmTopico(u);
    assertEquals(u.pontos, 25);
  }
  
  @Test
  public void pontosCriarTopicoBonusDoDia() {
    Usuario u = new Usuario();
    u.nome = "Guerra";
    CalculadoraBonus cb = new CalculadoraBonus();
    cb.bonusDoDia = 3;
    RegistraPonto rp = new RegistraPonto(cb);
    rp.criarUmTopico(u);
    assertEquals(u.pontos, 15);
  }
  
  @Test
  public void pontosCriarTopicoVIPBonusDoDia() {
    Usuario u = new Usuario();
    u.nome = "Guerra";
    u.vip = true;
    CalculadoraBonus cb = new CalculadoraBonus();
    cb.bonusDoDia = 2;
    RegistraPonto rp = new RegistraPonto(cb);
    rp.criarUmTopico(u);
    assertEquals(u.pontos, 50);
  }

}
