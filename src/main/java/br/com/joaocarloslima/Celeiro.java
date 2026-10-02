package br.com.joaocarloslima;

public class Celeiro {

    private static final int CAPACIDADE = 100;
    private int qtdeBatatas = 2;
    private int qtdeCenouras = 2;
    private int qtdeMorangos = 2;

    public void armazenarBatata() {
        if (!possoArmazenar()) {
            throw new RuntimeException("Celeiro cheio.");
        }
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        if (!possoArmazenar()) {
            throw new RuntimeException("Celeiro cheio.");
        }
        qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        if (!possoArmazenar()) {
            throw new RuntimeException("Celeiro cheio.");
        }
        qtdeMorangos += 2;
    }

    private boolean possoArmazenar() {
        var total = qtdeBatatas + qtdeCenouras + qtdeMorangos;
        var disponivel = CAPACIDADE - total;
        return disponivel >= 2;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}