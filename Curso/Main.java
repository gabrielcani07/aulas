package Curso;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String time;
        String nome;
        Futebol torcida = new Futebol();
        System.out.println("Para qual time você torce? ");
        time = scan.nextLine();
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        torcida.setTime(time, nome);
        torcida.mostraTime();
    }
}
