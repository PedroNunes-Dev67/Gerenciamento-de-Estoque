package entidades;

public class Produto {
    private String nome;
    private double preco;       /*Encapsulamento*/
    private int quantidade;


    public Produto(String nome, double preco){
        this.nome = nome;                                /* Construtor*/
        this.preco = preco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){                  /*Set atributos encapsulados*/
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void MostrarDados(){
        double total = quantidade*preco;
        System.out.printf("Produto: %s | R$%.2f | %d Unidades | Total em estoque: R$%.2f%n",nome,preco,quantidade,total);
    }
    public void Adicionar(int quantidade){
        if(quantidade<=0){
            System.out.println("Valor invalido");
        }
        else {
            this.quantidade+=quantidade;
        }
    }
    public void Remover(int quantidade){
        this.quantidade-=quantidade;
    }
}
