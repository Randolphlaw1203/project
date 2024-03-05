package project.bccryptocoingecko.infra;


public enum Scheme {
  HTTPS, HTTP,;

  public String toLowerCase() {
    return this.name().toLowerCase(); // https or http
  }
}
