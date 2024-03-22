package Exercicio1;

public class Main {
    public static void main(String[] args) {

        Suprimentos produto = new Suprimentos(1, "Headset", 2, 450.00);
        Suprimentos produto2 = new Suprimentos(2, "Teclado", 1, 115.00);


        System.out.println("===== * Loja de Suprimentos de Informática * =====");

        System.out.println("Codigo do produto: " + produto.getNumItemFaturado());
        System.out.println("O item é: " + produto.getDescricaoItem());
        System.out.println("A quantidade é: " + produto.getQuantCompradoItem());
        System.out.println("Valor unitário é: " + produto.getPrecoUnitarioItem());
        double soma = produto.getInvoiceAmount();
        System.out.println("O valor total é: " + soma + "\n");

        System.out.println("Codigo do produto: " + produto2.getNumItemFaturado());
        System.out.println("O item é: " + produto2.getDescricaoItem());
        System.out.println("A quantidade é: " + produto2.getQuantCompradoItem());
        System.out.println("Valor unitário é: " + produto2.getPrecoUnitarioItem());
        soma = produto2.getInvoiceAmount();
        System.out.println("O valor total é: " + soma);
    }
}
