package desafios.d4;

public class Inversao {
    private String textoInvertido = "I ENIL SIHTHSIREBBIG S";
    private String[] linhas = new String[5];

    public Inversao() {
        linhas[0] = "I ENIL SIHTHSIREBBIG S";
        linhas[1] = "LEVELKAYAK";
        linhas[2] = "H YPPAHSYADILO";
        linhas[3] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        linhas[4] = "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE";
    }


    public void inversaoString(){
        int tamTotal = getTextoInvertido().length();
        String esq = textoInvertido.substring(0,tamTotal / 2);
        String dir = textoInvertido.substring(tamTotal / 2);
        char[] novaEsq = new char[tamTotal / 2];
        char[] novaDir = new char[tamTotal / 2];

        for (int i = 0, j = tamTotal / 2 - 1; i < tamTotal / 2; ++i, --j){
            if (i == (tamTotal / 2) / 2 || j == (tamTotal / 2) / 2){
                novaEsq[i] = esq.charAt(j);
                continue;
            }
            novaEsq[i] = esq.charAt(j);
        }

        for (int i = 0, j = tamTotal / 2 - 1; i < tamTotal / 2; ++i, --j){
            if (i == (tamTotal / 2) / 2 || j == (tamTotal / 2) / 2){
                novaDir[i] = dir.charAt(j);
                continue;
            }
            novaDir[i] = dir.charAt(j);
        }

        for (int i = 0; i<11;i++){
            System.out.print(novaEsq[i]);
        }
        System.out.print("");

        for (int i = 0; i<11;i++){
            System.out.print(novaDir[i]);
        }

    }

    public void inversaoString(String linha){
        int tamTotal = linha.length();
        String esq = linha.substring(0, tamTotal / 2);
        String dir = linha.substring(tamTotal / 2);
        char[] novaEsq = new char[tamTotal / 2];
        char[] novaDir = new char[tamTotal / 2];

        for (int i = 0, j = tamTotal / 2 - 1; i < tamTotal / 2; ++i, --j){
            if (i == (tamTotal / 2) / 2 || j == (tamTotal / 2) / 2){
                novaEsq[i] = esq.charAt(j);
                continue;
            }
            novaEsq[i] = esq.charAt(j);
        }

        for (int i = 0, j = tamTotal / 2 - 1; i < tamTotal / 2; ++i, --j){
            if (i == (tamTotal / 2) / 2 || j == (tamTotal / 2) / 2){
                novaDir[i] = dir.charAt(j);
                continue;
            }
            novaDir[i] = dir.charAt(j);
        }

        for (int i = 0; i<tamTotal/2;i++){
            System.out.print(novaEsq[i]);
        }
        System.out.print("");

        for (int i = 0; i<tamTotal/2;i++){
            System.out.print(novaDir[i]);
        }

    }

    public void decrifaLinhas(){
        for (String s:this.linhas){
            inversaoString(s);
            System.out.print("\n");
        }
    }

    public String getTextoInvertido() {
        return textoInvertido;
    }

    public void setTextoInvertido(String textoInvertido) {
        this.textoInvertido = textoInvertido;
    }

    public String[] getLinhas() {
        return linhas;
    }

    public void setLinhas(String[] linhas) {
        this.linhas = linhas;
    }
}
