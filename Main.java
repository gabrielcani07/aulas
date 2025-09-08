import java.util.Scanner;

public class Main {


    public static void main (String[] args){

        Cadastro cadastro = new Cadastro();
        Salario salario = new Salario();
        Scanner teclado = new Scanner(System.in);
        boolean telaInicial = (true);
        System.out.println("=== BEM-VINDO AO SISTEMA DE CADASTRO! ===");
        while (telaInicial) {
            System.out.println("DIGITE 1 PARA CADASTRAR.");
            System.out.println("DIGITE 2 PARA ALTERAR.");
            System.out.println("DIGITE 3 PARA EXCLUIR.");
            System.out.println("DIGITE 4 PARA CONSULTAR.");
            System.out.println("DIGITE 5 PARA ACESSAR O MENU DE SALARIO.");
            System.out.println("DIGITE 6 PARA ENCERRAR O PROGRAMA.");
            System.out.print("R: ");
            String menu = teclado.nextLine();

            switch (menu) {
                case "1":
                    cadastro.MetodoCad();
                    break;
                case "2":
                    cadastro.MetodoAlterar();
                    break;
                case "3":
                    cadastro.MetodoExcluir();
                    break;
                case "4":
                    cadastro.MetodoConsultar();
                    break;
                case "5":
                    salario.MenuSalario();
                    break;
                case "6":
                    System.out.println("Sistema encerrado");
                    telaInicial = false;
                    break;
                default:
                    System.out.println("Você digitou um valor inválido");
                    break;

            }
        }
    }
}