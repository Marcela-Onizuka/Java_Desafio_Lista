import java.util.Scanner;
public class Desafio03{
    public Desafio03(){

    }
    public void Executar(){
        float medida, centimetros;
        Scanner sc = new Scanner (System.in);
        System.out.println ("Informe a medida em metros: ");
        medida = sc.nextFloat();
        centimetros = medida*100;
        System.out.println("A medida " +medida+ " é equivalente a " +centimetros+ " centímetros");
        System.out.println("A medida " +medida+ " é equivalente a " +medida*1000+ " milímetros");
    }
    public static void main (String args[]) {
        Desafio03 desafio03;
        desafio03 = new Desafio03();
        desafio03.Executar();
    }
}