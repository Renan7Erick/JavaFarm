package br.com.joaocarloslima;

public class Fazenda {

    private Terreno[][] terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        this.terrenos = new Terreno[13][13];
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                this.terrenos[x][y] = new Terreno();
            }
        }
        this.celeiro = new Celeiro(100);
    }

    public Terreno getTerreno(int x, int y) {
        if (x < 0 || x >= 13 || y < 0 || y >= 13) {
            throw new IllegalArgumentException("Coordenadas fora dos limites da fazenda!");
        }
        return terrenos[x][y];
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public void plantarBatata(int x, int y) {
        Terreno t = getTerreno(x, y);
        t.plantarBatata();
    }

    public void plantarCenoura(int x, int y) {
        Terreno t = getTerreno(x, y);
        t.plantarCenoura();
    }

    public void plantarMorango(int x, int y) {
        Terreno t = getTerreno(x, y);
        t.plantarMorango();
    }

    public void colher(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (!t.podeColher()) {
            throw new IllegalStateException("A planta ainda não pode ser colhida ou o terreno está vazio!");
        }

        if (t.getBatata() != null) {
            celeiro.armazenarBatata();
        } else if (t.getCenoura() != null) {
            celeiro.armazenarCenoura();
        } else if (t.getMorango() != null) {
            celeiro.armazenarMorango();
        }

        t.colher();
    }
}
