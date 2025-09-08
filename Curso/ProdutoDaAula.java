package Curso;

public class ProdutoDaAula {
        String nomeProd;
        double valorProd;
        String dataVal;
        int lote;
        String descricaoProd;

        void DadosProd() {
            System.out.println("Nome do produto: " + nomeProd);
            System.out.print("Valor do produto: " + valorProd);
            System.out.println("Data validade do produto: " + dataVal);
            System.out.println("Data fabricação produto: " + lote);
            System.out.println("Descrição do produto: " + descricaoProd);
        }
}