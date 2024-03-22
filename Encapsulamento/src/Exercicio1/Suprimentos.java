package Exercicio1;

public class Suprimentos {
    private int numItemFaturado;
    private String descricaoItem;
    private int quantCompradoItem;
    private double precoUnitarioItem;

    public Suprimentos(int numItemFaturado, String descricaoItem, int quantCompradoItem, double precoUnitarioItem){
        this.numItemFaturado = numItemFaturado;
        this.descricaoItem = descricaoItem;

        if (quantCompradoItem <= 0) {
            this.quantCompradoItem = 0;
        }else{
            this.quantCompradoItem = quantCompradoItem;
        }

        if (precoUnitarioItem <= 0 ) {
            this.precoUnitarioItem = 0;
        }else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    public int getNumItemFaturado() {
        return numItemFaturado;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public int getQuantCompradoItem() {
        return quantCompradoItem;
    }

    public double getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setNumItemFaturado(int numItemFaturado) {
        this.numItemFaturado = numItemFaturado;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public void setQuantCompradoItem(int quantCompradoItem) {
        if (quantCompradoItem <= 0) {
            this.quantCompradoItem = 0;
        }else{
            this.quantCompradoItem = quantCompradoItem;
        }
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        if (precoUnitarioItem <= 0 ) {
            this.precoUnitarioItem = 0;
        }else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }

    public double getInvoiceAmount() {
        return quantCompradoItem * precoUnitarioItem;
    }
}