package Exercicio2;

public class Main {
    public static void main(String[] args) {
            Colaborador firma = new Colaborador("Karen", "Nogueira", 2000.00);
            Colaborador firma2 = new Colaborador("Max", "Santana", 4118.00);


            System.out.println("======= * Reajuste Salarial * ======");


            System.out.println("Nome do colaborador: " + firma.getPrimeiroNome() + " "+ firma.getSobrenome());
            System.out.println("Valor salario mensal: " + firma.getSalarioMensal());
            double salarioAnual = firma.salarioAnual();
            System.out.println("Valor do salario anual: " + salarioAnual);
            firma.aumentoSalarial();
            System.out.println("Valor do salário anual com ajuste: "+ firma.salarioAnual() + "\n");

            System.out.println("Nome do colaborador: " + firma2.getPrimeiroNome() + " "+ firma2.getSobrenome());
            System.out.println("Valor salario mensal: " + firma2.getSalarioMensal());
            salarioAnual = firma2.salarioAnual();
            System.out.println("Valor do salario anual: " + salarioAnual);
            firma2.aumentoSalarial();
            System.out.println("Valor do salário anual com ajuste: "+ firma2.salarioAnual());
        }
    }