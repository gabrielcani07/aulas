package Curso;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    ProdutoDaAula produto = new ProdutoDaAula();

    System.out.print("Digite o valor do produto: ");
    produto.valorProd = teclado.nextDouble();
    System.out.print("Digite o lote do produto: ");
    produto.lote = teclado.nextInt();
    System.out.print("Digite o nome do produto: ");
    produto.nomeProd = teclado.nextLine();
    System.out.print("Digite a data de validade do produto: ");
    produto.dataVal = teclado.nextLine();
    System.out.print("Digite a descrição do produto: ");
    produto.descricaoProd = teclado.nextLine();

    produto.DadosProd();

    }
}