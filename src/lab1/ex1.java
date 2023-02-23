package lab1;

import java.util.Scanner;

//1. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria unui
//dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura. Sa se adauge un break
//point pe prima linie care citește valoarea unei laturi si din acel punct să se ruleze programul
//linie cu linie urmărind valorile variabilelor în memorie.
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lungime, latime;

        System.out.println("Dati lungimea dorita");
        lungime= scanner.nextInt();
        System.out.println("Dati latimea dorita");
        latime= scanner.nextInt();
        scanner.close();

        int perimetru=lungime+latime;
        int arie=lungime*latime;

        System.out.println("Perimetrul este: " + perimetru);
        System.out.println("Aria este: " +arie);


    }
}
