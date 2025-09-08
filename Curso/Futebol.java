package Curso;

public class Futebol {
private String nomeTime;
private String nomePessoa;
public void setTime (String meuTime, String meuNome){
    nomeTime=meuTime;
    nomePessoa = meuNome;

    }
    public String getTime(){
    return nomeTime;
    }
    public void mostraTime(){
    System.out.printf("Seu time do coração é %s\n", getTime());
        System.out.printf("Seu nome é %s", nomePessoa);
    }
}