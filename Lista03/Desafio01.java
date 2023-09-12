/* Desafio 001 - Crie um programa que leia um número e mostre o seu dobro, 
seu triplo e sua raiz quadrada. */
import java.util.Scanner;
public class Desafio01 {
    public Desafio01(){
        
    }
    public void Executar(){
        double num1, res;
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe o valor: ");
        num1 = sc.nextDouble();
        res=num1*2;

        System.out.println("O dobro do valor é: " +res);
        res=num1*3;
        
        System.out.println("O triplo do valor é: " +res);
        res=Math.sqrt(num1);
        System.out.println("A raiz quadrada do valor é: " +res);
    }
    public static void main (String[] args) {
        Desafio01 desafio01;
        desafio01 = new Desafio01();
        desafio01.Executar();    
    }
}