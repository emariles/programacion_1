import java.util.Scanner;
public class punto517 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int sw;
        double n;
        sw=0;
        while (sw==0){
            System.out.println("DEME UN NUMERO");
            n=leer.nextInt();
            if (n!=(int)n){
                System.out.println("dato no valido");
                System.out.println("ejecute nuevamente");
                sw++;
            }else{
                   System.out.println("correcto"+n+ "es entero");break;
                }
            }
        }

    }
