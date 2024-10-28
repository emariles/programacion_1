import java.util.Random;
import java.util.Scanner;

class Personaje {
    private String nombre;
    private int puntosDeVida;
    // en mayusculas porque es constate y el "private final" es porque no va a
    // cambiar***
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    // firma la firam de este metodo es publico no retora tipo de bariable personage
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        // para de clarar un aleatorio rand
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) +
                MIN_DANO;
        oponente.recibirDano(dano);
        System.out.print(this.nombre + " ataca a " +
                oponente.getNombre() + " causando " + dano + "puntos de dano .");
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