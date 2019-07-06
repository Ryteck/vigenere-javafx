package function;

public class Validador {

    private char[] caracteres;

    public static final char[] letrasMin = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char[] letrasMai = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public Validador(char[] caracteres) {
        this.caracteres = caracteres;
    }

    public boolean[] gerarValidacaoChar(){

        boolean[] b = new boolean[caracteres.length];

        for (int cont = 0; cont < caracteres.length; cont++){

            b[cont] = validar(caracteres[cont]);

        }

        return b;
    }

    private boolean validar(char caracter){
        for (char letra : letrasMin){
            if (caracter == letra){return true;}
        }
        for (char letra : letrasMai){
            if (caracter == letra){return true;}
        }
        return false;
    }
}
