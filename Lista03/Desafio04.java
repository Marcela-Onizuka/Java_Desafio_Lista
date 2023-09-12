import java.util.Scanner;
public class Desafio04{
    public Desafio04(){

    }
    public void Executar(){
        int tab;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor:  ");
        tab = sc.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(tab+"x"+i+"="+tab*i);
        }
    }
    public static void main (String[] args) {
        Desafio04 desafio04;
        desafio04 = new Desafio04();
        desafio04.Executar();
    }
}