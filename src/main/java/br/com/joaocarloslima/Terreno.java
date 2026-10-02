package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private final int x;
    private final int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata) {
        if (!estaOcupado())
            this.batata = batata;
    }

    public void plantar(Morango morango) {
        if (!estaOcupado())
            this.morango = morango;
    }

    public void plantar(Cenoura cenoura) {
        if (!estaOcupado())
            this.cenoura = cenoura;
    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}