package novi.basics;

import java.util.Scanner;

import novi.basics.Game;

public class Main {
    static Scanner PLAYERINPUT = new Scanner(System.in);

    public static void main(String[] args) {

        // -- vanaf hier gaan we het spel opnieuw spelen met andere spelers (nadat op het eind  keuze 2 gekozen is)

        // de 1e speler om zijn naam vragen
        System.out.println("Player 1, what is your name?");
        // de naam van de 1e speler opslaan
        String player1Name = PLAYERINPUT.next();

        Player player1 = new Player(player1Name, 'x');

        // de 2e speler om zijn naam vragen
        System.out.println("Player 2, what is your name?");
        // de naam van de 2e speler opslaan
        String player2Name = PLAYERINPUT.next();
        Player player2 = new Player(player2Name, 'o');

        // opslaan hoeveel keer er gelijk spel is geweest
        int drawCount = 0;
        // -- vanaf hier gaan we het spel opnieuw spelen met dezelfde spelers (nadat op het eind keuze 1 gekozen is)
        Game game = new Game(player1, player2);
        game.play();
        // speelbord opslaan (1 - 9)
        // uitleg: omdat we altijd met een bord starten met 9 getallen, kunnen we het Tic Tac Toe bord ook direct een waarde geven
        // zie demo project code voor de andere manier met de for loop


        // maximale aantal rondes opslaan


        // token van de actieve speler opslaan
        char activePlayerToken = 'X';


        // -- terug naar het begin van de volgende beurt
    }
    // vragen of de spelers nog een keer willen spelen
    //1: nog een keer spelen
    //2: van spelers wisselen
    //3: afsluiten

    // speler keuze opslaan

    // bij keuze 1: terug naar het maken van het bord
    // bij keuze 2: terug naar de start van de applicatie en het vragen van spelernamen
    // bij keuze 3: het spel en de applicatie helemaal afsluiten


}