import java.util.Scanner;

public class Salario {
    double salario;
    double ir;
    double inss;
    double fgts;
    double salariofinal;
    Scanner teclado = new Scanner (System.in);
    Cadastro cadastro = new Cadastro();

    public void MenuSalario(){
        boolean telasalario = (true);

        while (telasalario) {
            System.out.println("=== TELA DE SALARIO! ===");
            System.out.println("DIGITE 1 PARA INFORMES DO SALARIO");
            System.out.println("DIGITE 2 PARA CONSULTAR DESCONTOS.");
            System.out.println("DIGITE 3 PARA RETORNAR AO MENU INICIAL.");
            System.out.print("R: ");
            String menusalario = teclado.next();
            switch (menusalario){
                case"1":
                    InfoSalario();
                    break;
                case"2":
                    System.out.printf("Desconto IRRF: " + String.format("%.2f", ir )+"\n");
                    System.out.printf("Desconto INSS: " + String.format("%.2f", inss)+ "\n");
                    break;
                case"3":
                    telasalario = false;
                    break;
            }

        }
    }

        public void InfoSalario() {
        System.out.print("digite o valor do seu salário bruto: ");
        salario = teclado.nextDouble();
        if(salario < 2259.21){
            ir = 0;
            }
        else if (salario >= 2259.21 &&  salario <= 2826.65){
           ir = salario * 0.075;
        }
        else if (salario >= 2826.66 &&  salario <= 3751.05){
            ir = salario * 0.15;
        }
        else if (salario >= 3751.06 &&  salario < 4664.68){
            ir = salario * 0.225;
        }
        else if (salario > 4664.68){
            ir = salario * 0.275;
        }
        else{
            System.out.println("Imposto de Renda Invalido");
        }
        if (salario <= 1518.00){
            inss = salario * 0.075;
        }
        else if (salario >= 1518.01 && salario <= 2793.88){
            inss = salario * 0.09;
        }
        else if (salario >= 2793.89 && salario <= 4190.83){
            inss = salario * 0.12;
        }
        else if (salario >= 4190.84 && salario <= 8157.41){
            inss = salario * 0.14;
        }
        else{
            System.out.println("INSS Invalido");
        }
        fgts = salario * 0.08;
        salariofinal = (salario - ir - inss);
        System.out.printf("Seu salário líquido é de: " + String.format("%.2f", salariofinal)+"\n");
    }


}
