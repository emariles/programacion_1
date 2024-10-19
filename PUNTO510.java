import java.util.Scanner;

public class PUNTO510 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contadorDias = 0;
        double sumaMaxima = 0.0;
        double sumaMinima = 0.0;
        int contadorErrores = 0; // PUNTO510
        double temperaturaMinima;
        double temperaturaMaxima;
        double mediaMaxima;
        double mediaMinima;
        double porcentajeErrores;
        while (true) {
            System.out.println("Ingrese la temperatura máxima del día (0.0 para terminar):");

            temperaturaMaxima = leer.nextDouble();
            System.out.println("Ingrese la temperatura mínima del día: ");

            temperaturaMinima = leer.nextDouble();

            if (temperaturaMaxima == 0.0 && temperaturaMinima == 0.0) {
                break;
            }
        }
        contadorDias++;

        if (temperaturaMaxima == 9) { 
            contadorErrores++;
        }
        if (temperaturaMinima == 9) {
            contadorErrores++;
        }
        sumaMaxima += temperaturaMaxima;
        sumaMinima += temperaturaMinima;

        if (contadorDias > 0) {
            mediaMaxima = sumaMaxima / contadorDias;
        } else {
            mediaMaxima = 0;
        }
        
        if (contadorDias > 0) {
            mediaMinima = sumaMinima / contadorDias;
        } else {
            mediaMinima = 0;
        }

       
       

        if (contadorDias > 0) {
            porcentajeErrores = (contadorErrores / (contadorDias * 2.0)) * 100;
        } else {
            porcentajeErrores = 0;
        }

        
        System.out.println("Número de días: " + contadorDias);
        System.out.println("Media de temperaturas máximas: " + mediaMaxima);
        System.out.println("Media de temperaturas mínimas: " + mediaMinima);
        System.out.println("Número de errores (temperaturas de 9°): " + contadorErrores);
        System.out.println("Porcentaje de errores: " + porcentajeErrores + "%");
    }
}
