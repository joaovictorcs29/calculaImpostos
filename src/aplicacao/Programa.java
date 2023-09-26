package aplicacao;

import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import entidades.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        List <Pessoas> list = new ArrayList<Pessoas>();

        System.out.print("Entre com o número de pagadores de impostos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Dados do pagador de impostos #"+ i);
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (tipo == 'f'){
                System.out.print("Gastos com saúde: ");
                double gastoSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual,gastoSaude));
            }
            else {
                System.out.print("Números de funcionários: ");
                int nmrFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, nmrFuncionarios));
            }
        }
        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");

        for (Pessoas pe : list) {
            System.out.println(pe.getNome() + ": R$ " + String.format("%.2f",pe.calculaImposto()));
        }

        System.out.println();
        double soma = 0.0;
        for (Pessoas pe : list) {
            soma +=pe.calculaImposto();
        }

        System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", soma ));
        sc.close();
    }
}
