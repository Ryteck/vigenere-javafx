package function;

import models.Codigo;

public class Conversor {

    private Codigo code;
    private Validador val;
    private Cifra cifra;

    private char[] entrada;
    private char[] saida;
    private char[] password;

    public Conversor(Codigo code) {
        this.code = code;
        converter();
    }

    private void converter(){

        gerarArrays();

        val = new Validador(entrada);

        boolean[] validacaoChar = val.gerarValidacaoChar();

        for (int cont = 0; cont < entrada.length; cont++){
            if (validacaoChar[cont]){

                if (entrada[cont] >= 65 && entrada[cont] <= 90){ saida[cont] = gerarCaracter(cont, true); }

                if (entrada[cont] >= 97 && entrada[cont] <= 122){ saida[cont] = gerarCaracter(cont, false); }

                continue;
            }
            saida[cont] = entrada[cont];
        }

        code.setSaida(new String(saida));
    }

    private void gerarArrays(){
        entrada = code.getEntrada().toCharArray();
        password = code.getSenha().toCharArray();
        saida = new char[entrada.length];
    }

    private char gerarCaracter(int position, boolean isUpper){

        String in = String.valueOf(entrada[position]);

        if (!isUpper){ in.toUpperCase(); }

        int value = (position + 1) % (password.length);

        cifra = new Cifra(in, String.valueOf(password[value]), code.isDecode());

        String out = cifra.cifrador();

        if (!isUpper){ out.toLowerCase(); }

        return out.charAt(0);
    }
}
