package br.com.joaocarloslima;

public class Morango {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Morango() {
        this.tamanho = 1;
        this.tempoDeVida = 1;
        this.tempoDeCrescimento = 4;
    }

    public void crescer() {
        this.tempoDeVida++;
        if (this.tamanho < 4 && this.tempoDeVida % this.tempoDeCrescimento == 0) {
            this.tamanho++;
        }
    }

    public boolean podeColher() {
        return this.tamanho == 4;
    }

    public String getImagem() {
        return "images/morango" + this.tamanho + ".png";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }
}
