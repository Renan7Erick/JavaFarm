package br.com.joaocarloslima;

public class Batata extends Produto {

    //sobrescrita
    @Override 
    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }

}
