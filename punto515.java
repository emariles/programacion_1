import java.util.Scanner;

public class punto515 {

    public static void main(String[] args) {
        int i;
        double min, max, num;
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el primer numero");

        num=leer.nextInt();
        min = num;
        max = num;
        for ( i = 2; i <= 7; i++) {
            System.out.print("Ingresa el la cantidad " + i + ": ");
            num = leer.nextDouble();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        } System.out.println(" maximo= " + max + " minimo= " + min);
    }
 }