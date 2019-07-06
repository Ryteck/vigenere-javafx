package models;

public class Codigo {

    private String entrada;
    private String saida;
    private String senha;
    private boolean decode;

    public Codigo(String entrada, String saida, String senha, boolean decode) {
        this.entrada = entrada;
        this.saida = saida;
        this.senha = senha;
        this.decode = decode;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isDecode() {
        return decode;
    }
}
