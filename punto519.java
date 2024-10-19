import java.util.Scanner;

public class punto519 {
    public static void main(String[] args) {
        String  nombre;
        double media;
        double basic, pascal, fortran;
        Scanner leer= new Scanner(System.in);
        System.out.println("ingresa tu nombre(para terminar escriba ***): ");
        nombre=leer.nextLine();
        while (true){
            System.out.println("ingrese el nombre del alumno ");
            nombre=leer.nextLine();
            if (nombre.equals("***")) {
                break;




            }
                 
            System.out.println("la calificacion de basic:");
            basic=leer.nextDouble();

            System.out.println("ingrese la nota de pascal:");
            pascal=leer.nextDouble();

            System.out.println("ingrese la nota de fortran:");
            fortran=leer.nextDouble();
            media=(basic+pascal+fortran)/3;
            System.out.println("la media de:"+nombre+ "es:"+media);

            leer.nextLine();
        }
    }
}
