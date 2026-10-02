package br.com.joaocarloslima;

public abstract class Produto {

    private int tamanho;
    private int tamanhoMaximo;

    public void crescer() {
    }

    public boolean podeColher() {
        return tamanho == tamanhoMaximo;
    }

    public String getImagem() {
        return "images/" + tamanho + ".png";

    public int getTamanho() {
        return tamanho;
    }

}
