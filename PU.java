import java.util.Scanner;

public class PU {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contadorDias = 0;
        double sumaMaxima = 0.0;
        double sumaMinima = 0.0;
        int contadorErrores = 0;
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
