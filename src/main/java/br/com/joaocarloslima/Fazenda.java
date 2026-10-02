package br.com.joaocarloslima;

public class Fazenda {

    public void plantarBatata(int x, int y) {
        var terreno = getTerreno(x, y);
        Produto produto = new Batata();
        terreno.plantar(produto);

    }

    public void plantarCenoura(int x, int y) {
        var terreno = getTerreno(x, y);
        terreno.plantar(new Cenoura());
    }

    public void plantarMorango(int x, int y) {
        var terreno = getTerreno(x, y);
        terreno.plantar(new Morango());

    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.get(x, y);
    }

}
