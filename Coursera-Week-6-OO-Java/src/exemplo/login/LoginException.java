package exemplo.login;

public class LoginException
  extends Exception {
  
  private String login;

  /**
   * Construtor.
   * @param message
   */
  public LoginException(String message, String login) {
    super(message);
    this.login = login;
  }

  /**
   * Retorna o valor da propriedade login.
   * 
   * @return {@link #login}
   */
  public String getLogin() {
    return login;
  }

}
