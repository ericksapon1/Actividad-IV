import java.util.Scanner;

public class JuegoDeCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ingresar el número de jugadores
        System.out.println("Ingrese el número de Jugadores");
        int n = sc.nextInt();

        //ingresar el número de partidas.
        System.out.println("Ingrese el número de partidas a jugar");
        int p = sc.nextInt();

        Juego juego = new Juego(n, p);
        juego.jugar();

    }
}
