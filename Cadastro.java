import java.util.Scanner;

public class Cadastro {
    String nome;
    int idade;
    Scanner teclado = new Scanner(System.in);
    public void MetodoCad(){
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        teclado.nextLine();
    }
    public void MetodoAlterar(){
        System.out.print("Digite seu nome Atualizado: ");
        nome = teclado.nextLine();
        System.out.print("Digite sua idade Atualizada: ");
        idade = teclado.nextInt();
        teclado.nextLine();
    }
    public void MetodoExcluir(){
        System.out.println("DIGITE 1 PARA EXCLUIR SEU NOME");
        System.out.println("DIGITE 2 PARA EXCLUIR SUA IDADE");
        System.out.println("DIGITE 3 PARA EXCLUIR AMBOS");
        System.out.print("R: ");
        String excluir = teclado.nextLine();

        switch (excluir){
            case "1":
                nome = null;
                break;
            case "2":
                idade = 0;
                break;
            case "3":
                nome = null;
                idade = 0;
                break;
            default:
                break;
        }
    }
    public void MetodoConsultar(){
        if (nome == null && idade > 0){
        System.out.println("Seu cadastro esta sem nome");
        System.out.println("Sua idade atual é: " + idade);
        }
        else if (idade == 0 && nome != null){
            System.out.println("Seu cadastro esta sem idade");
            System.out.println("Seu nome atual é: " + nome);
        }
        else if(idade == 0 && nome == null){
            System.out.println("Seu cadastro esta vazio");
        }
        else {
            System.out.println("Seu nome atual é: " + nome);
            System.out.println("Sua idade atual é: " + idade);

        }
    }
}
