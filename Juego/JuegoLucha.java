import java.util.Random;
import java.util.Scanner;

class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    // el publuc es el constructor
    public JuegoLucha(String nombre1, String nombre2) {
        // estos son los atrivutos de constructor
        this.jugador1 = new Personaje(nombre1);
        this.jugador2 = new Personaje(nombre2);
    }

    public void iniciarPelea() {
        System.out.print("La pelea comienza entre " +
                jugador1.getNombre() + " y " + jugador2.getNombre() + "...");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.print(jugador1.getNombre() + " haganado la pelea .");
        } else {
            System.out.print(jugador2.getNombre() + " haganado la pelea .");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.print(" Turno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": "
                + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.print(defensor.getNombre() + " ahoratiene " + defensor.getPuntosDeVida() + " puntosde vida .");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Introduce el nombre del jugador 1:");
        String nombre1 = scanner.nextLine();

        System.out.print(" Introduce el nombre del jugador 2:");
        String nombre2 = scanner.nextLine();

        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();
    }

}