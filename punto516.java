import java.util.Scanner;

public class punto516 {
 
    public static void main (String []args){
        Scanner leer = new Scanner(System.in);

        int N1, N2;
        double M, MAX;
         System.out.println( " ingrese el primer numero:");
         N1= leer.nextInt();

         System.out.println("ingrese el segundo numero:");
         N2 = leer.nextInt();
         MAX=(N1+N2)/2;
         while (N1 != 900 || N2 !=999){
         System.out.println("ingrese el siguiente numero:");
            N1 =N2;
            N2 = leer.nextInt();



            if ( N1 == 900 && N2 ==999) break;
            M=(N1+N2)/2;
            
            if (M> MAX){
                MAX=M;
            }
           
          



            }System.out.println("medida maxima:" +MAX);
         }
    }

