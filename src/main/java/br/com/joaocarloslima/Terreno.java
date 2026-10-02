package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;

    public Terreno() {
        this.batata = null;
        this.cenoura = null;
        this.morango = null;
    }

    public boolean estaVazio() {
        return batata == null && cenoura == null && morango == null;
    }

    public boolean isOcupado() {
        return !estaVazio();
    }

    public void plantarBatata() {
        if (isOcupado()) {
            throw new IllegalStateException("O terreno já se encontra ocupado!");
        }
        this.batata = new Batata();
    }

    public void plantarCenoura() {
        if (isOcupado()) {
            throw new IllegalStateException("O terreno já se encontra ocupado!");
        }
        this.cenoura = new Cenoura();
    }

    public void plantarMorango() {
        if (isOcupado()) {
            throw new IllegalStateException("O terreno já se encontra ocupado!");
        }
        this.morango = new Morango();
    }

    public void crescer() {
        if (batata != null) {
            batata.crescer();
        } else if (cenoura != null) {
            cenoura.crescer();
        } else if (morango != null) {
            morango.crescer();
        }
    }

    public boolean podeColher() {
        if (batata != null) {
            return batata.podeColher();
        } else if (cenoura != null) {
            return cenoura.podeColher();
        } else if (morango != null) {
            return morango.podeColher();
        }
        return false;
    }

    public void colher() {
        if (!podeColher()) {
            throw new IllegalStateException("A planta ainda não está pronta para ser colhida!");
        }
        this.batata = null;
        this.cenoura = null;
        this.morango = null;
    }

    public String getImagem() {
        if (batata != null) {
            return batata.getImagem();
        } else if (cenoura != null) {
            return cenoura.getImagem();
        } else if (morango != null) {
            return morango.getImagem();
        }
        return "images/terra.png";
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
}
