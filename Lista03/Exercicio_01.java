import java.util.Scanner;
public class App {
    public static vois main (String[] args) throws Exception {
        float num1, res;

        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o valor: ");
        num1 = sc.nextFloat();
        
        res=num1*2;
        System.out.println("O dobro do valor é: " +res);
        
        res=num1*3;
        System.out.println("O triplo do valor é: " +res);

        res=Math.sqrt(num1);
        System.out.println("A raiz quadrada do valor é: " +res);

    }
}