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

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
