import java.util.Scanner;
public class Desafio10{
    public Desafio10(){

    }
    public void Executar(){
        Double dias, km, total;
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantos dias usará o carro: ");
        dias = sc.nextDouble();
        System.out.println("Qual a quilometragem percorrida: ");
        km = sc.nextDouble();
        total = (dias*60)+(km*0.15);
        System.out.println("O total do aluguel será: "+total);

    }
    public static void main (String[] args){
        Desafio10 desafio10;
        desafio10 = new Desafio10();
        desafio10.Executar();

    }
}