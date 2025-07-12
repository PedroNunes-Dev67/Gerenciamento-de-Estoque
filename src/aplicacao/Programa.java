package aplicacao;

import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidade;
        int escolha;

        System.out.print("Produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Produto produto_1 = new Produto(nome,preco);

        do {
            System.out.println();
            produto_1.MostrarDados();
            System.out.println("Operaççoes:");
            System.out.println("(1) Adicionar ao estoque");
            System.out.println("(2) Remover do estoque");
            System.out.println("(3) Alterar quantidade total do estoque");
            System.out.println("(4) Alterar Produto");
            System.out.println("(5) Alterar Preço");
            System.out.println("(6) Finalizar operação");
            System.out.print("Digite sua escolha: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.print("Valor a ser inserido: ");
                    quantidade = sc.nextInt();
                    produto_1.Adicionar(quantidade);
                    break;
                case 2:
                    System.out.print("Valor a ser removido: ");
                    quantidade = sc.nextInt();
                    produto_1.Remover(quantidade);
                    break;
                case 3:
                    System.out.print("Nova quantidade: ");
                    quantidade = sc.nextInt();
                    produto_1.setQuantidade(quantidade);
                    System.out.println("Quantidade atualizada!");
                    break;
                case 4:
                    System.out.print("Digite o novo produto: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    produto_1.setNome(nome);
                    System.out.println("Produto atualizado!");
                    break;
                case 5:
                    System.out.print("Digite o novo preço: ");
                    preco=sc.nextDouble();
                    produto_1.setPreco(preco);
                    System.out.println("Preço atualizado1");
                    break;
                case 6:
                    break;
            }
        } while (escolha!=6);

        System.out.println();
        produto_1.MostrarDados();
        System.out.println("Operação finalizada com Sucesso!");

        sc.close();
    }
}
