package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
        this.qtdeBatatas = 0;
        this.qtdeCenouras = 0;
        this.qtdeMorangos = 0;
    }

    public int getCapacidade() {
        return capacidade;
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

    public int getTotalArmazenado() {
        return qtdeBatatas + qtdeCenouras + qtdeMorangos;
    }

    public int getEspacoDisponivel() {
        return capacidade - getTotalArmazenado();
    }

    public boolean celeiroCheio() {
        return getTotalArmazenado() >= capacidade;
    }

    public double getOcupacao() {
        if (capacidade == 0) {
            return 0.0;
        }
        return (double) getTotalArmazenado() / capacidade;
    }

    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) {
            throw new IllegalStateException("Celeiro cheio! Não há espaço para armazenar batatas.");
        }
        this.qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) {
            throw new IllegalStateException("Celeiro cheio! Não há espaço para armazenar cenouras.");
        }
        this.qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) {
            throw new IllegalStateException("Celeiro cheio! Não há espaço para armazenar morangos.");
        }
        this.qtdeMorangos += 2;
    }

    public void consumirBatata() {
        if (this.qtdeBatatas <= 0) {
            throw new IllegalStateException("Sem batatas disponíveis no celeiro.");
        }
        this.qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (this.qtdeCenouras <= 0) {
            throw new IllegalStateException("Sem cenouras disponíveis no celeiro.");
        }
        this.qtdeCenouras--;
    }

    public void consumirMorango() {
        if (this.qtdeMorangos <= 0) {
            throw new IllegalStateException("Sem morangos disponíveis no celeiro.");
        }
        this.qtdeMorangos--;
    }
}

