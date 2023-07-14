package desafios.d4;

public class Inversao {
    private String texto = "this line is gibberish";

    public Inversao() {
    }

    public Inversao(String texto) {
        this.texto = texto;
    }

    public void inversaoString(){
        int tamTotal = getTexto().length();
        String esq = texto.substring(0,11);
        String dir = texto.substring(11);
        char[] novaEsq = new char[tamTotal / 2];
        for (int i = 0, j = tamTotal / 2 - 1;i < tamTotal / 2; ++i, --j){
            if (i == 5 || j == 5){
                novaEsq[i] = esq.charAt(j);
                continue;
            }
            novaEsq[i] = esq.charAt(j);

        }
        for (int i = 0; i<11;i++){
            System.out.print(novaEsq[i]);
        }

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
