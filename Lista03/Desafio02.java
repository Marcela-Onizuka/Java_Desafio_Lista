import java.util.Scanner;
public class Desafio02 {

    public Desafio02(){

    }
    public void Executar(){
        float n1, n2, media;

        Scanner sc = new Scanner (System.in);
        System.out.println ("Qual a primiera nota: ");
        n1 = sc.nextFloat();
        System.out.println ("Qual a segunda nota: ");
        n2 = sc.nextFloat();

        media=(n1+n2)/2;

        System.out.println("A media é de " +media);

    }
    public static void main (String[] args) {
        Desafio02 desafio02;
        desafio02 = new Desafio02();
        desafio02.Executar();
    }
}