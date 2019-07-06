package function;

public class Cifra {

    private String caracterEntrada;
    private String caracterSenha;
    private boolean decode;

    public Cifra(String caracterEntrada, String caracterSenha, boolean decode) {
        this.caracterEntrada = caracterEntrada;
        this.caracterSenha = caracterSenha;
        this.decode = decode;
    }

    public String cifrador(){ if (decode){ return descriptografar(); }else{ return criptografar(); } }

    private String criptografar(){
        return "";
    }

    private String descriptografar(){
        return "";
    }
}
