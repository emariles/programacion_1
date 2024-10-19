import java.util.Scanner;
public class punto59 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int contadorA =0;
        int contadorB=0;
        Double totalA =0.0;
        double totalB =0.0;
        double preciounitario;
        String codigoArticulo;
        int numeroArticulo;

        while (true) {
            System.out.println("ingrese el codigo del articulo (A/B) o `X` para terminar:");
            codigoArticulo =leer.nextLine();
           
            if (codigoArticulo.equals("X")) {
                break; 
            }

            System.out.println("ingrese el precio unitario:");
             preciounitario= leer.nextDouble();
            System.out.println("ingrese el numero de articulos:");
            
            numeroArticulo = leer.nextInt();
            leer.nextLine();


            if (codigoArticulo.equals("A")){
                contadorA += numeroArticulo;
                totalA += preciounitario * numeroArticulo;
             }else if (codigoArticulo.equals("B")){
                contadorB += numeroArticulo;
                totalB += preciounitario * numeroArticulo;
             }else{
                System.out.println("codigo de articulo invalido. intente de nuevo. ");
             }
        }
         System.out.println("Numero total de articulos A: " + contadorA);
         System.out.println("Imprte total de articulos A: " + totalA);
         System.out.println(" Numero total de articulos B:" + contadorB);
         System.out.println("Importe total de articulos B:" + totalB);
     }
 }
    

