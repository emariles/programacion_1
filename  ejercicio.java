import java.util.Random;
import java.util.Scanner;

class personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    public personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;

    }

    public void atacar(personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + "atacar a" + oponente.getNombre() + "causando" + dano + "puntos de dano.");

    }

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;

    }

    public String getNombre() {
        return this.nombre;

    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;

    }

}

class JuegoLucha {
    private personaje jugador1;
    private personaje jugador2;

    public JuegoLucha(String nombre1, String nombre2) {

        this.jugador1 = new personaje(nombre1);
        this.jugador2 = new personaje(nombre2);
    }

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " +
                jugador1.getNombre() + " y " + jugador2.getNombre() + "...");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
           turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea .");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea .");
        }
    }

    private void turno ( Personaje atacante , Personaje
    defensor ) {
     System . out . println (" Turno de " + atacante . getNombre () + ". Puntos de vida de " + defensor . getNombre  () + ": " + defensor . getPuntosDeVida () ) ;
     atacante . atacar ( defensor ) ;
     System . out . println ( defensor . getNombre () + " ahora
    tiene " + defensor . getPuntosDeVida () + " puntos de vida .") ;
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print(" Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();
    }
}