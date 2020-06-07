package novi.basics;

import java.util.Scanner;

import static novi.basics.Main.PLAYERINPUT;


public class Game {
    private int maxRounds;
    private Player player1;
    private Player player2;
    private Player activePlayer;
    private char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private int draw;

    public Game(Player player1, Player player2) {

        maxRounds = board.length;
        this.player1 = player1;
        this.player2 = player2;
        activePlayer = player1;
        draw = 0;
    }


    public void play() {


        // starten met de beurt (maximaal 9 beurten)
        printBoard();
        for (int round = 0; round < maxRounds; round++) {
            // naam van de actieve speler opslaan
            String activePlayerName = activePlayer.getName();
            if (activePlayer == player1) {
                activePlayer = player1;
            } else {
                activePlayer = player2;
            }
            // actieve speler vragen om een veld te kiezen (1 - 9)
            System.out.println(activePlayer.getName() + ", please choose a field");

            // gekozen veld van de actieve speler opslaan
            int chosenField = PLAYERINPUT.nextInt();
            int chosenIndex = chosenField - 1;

            // als het veld bestaat
            if (chosenIndex < 9 && chosenIndex >= 0) {
                //als het veld leeg is, wanneer er geen token staat
                if (board[chosenIndex] != player1.getToken() && board[chosenIndex] != player2.getToken()) {
                    // wanneer de speler een token op het bord kan plaatsen

                    // de token van de actieve speler op het gekozen veld plaatsen
                    board[chosenIndex] = activePlayer.getToken();
                    //player.score += 10;
                    // het nieuwe speelbord tonen
                    printBoard();
                    // als het spel gewonnen is
                    // tonen wie er gewonnen heeft (de actieve speler)
                    // de actieve speler krijgt een punt
                    // de scores van de spelers tonen

                    // wanneer we in de laatste beurt zijn en niemand gewonnen heeft
                    // aantal keer gelijk spel ophogen
                    // aantal keer gelijk spel tonen

                    // de beurt doorgeven aan de volgende speler (van speler wisselen)
                    // als de actieve speler, speler 1 is:
                    if (activePlayer == player1) {
                        // maak de actieve speler, speler 2
                        activePlayer = player2;
                    }
                    // anders
                    else {
                        // maak de actieve speler weer speler 1
                        activePlayer = player1;
                    }
                } //of al bezet is
                else {
                    maxRounds++;
                    System.out.println("this field is not available, choose another");
                }
                //versie 2: als het veld leeg is, wanneer de waarde gelijk is aan chosenField
                /*if(board[chosenIndex] != '1' + chosenIndex) {
                    board[chosenIndex] = activePlayerToken;
                }*/
            }
            // als het veld niet bestaat
            else {
                // het mamimale aantal beurten verhogen
                maxRounds++;
                // foutmelding tonen aan de speler
                System.out.println("the chosen field does not exist, try again");
            }
        }
    }

    public void printBoard() {
        for (int fieldIndex = 0; fieldIndex < maxRounds; fieldIndex++) {
            char number = board[fieldIndex];
            System.out.print(number + " ");
            // als we het tweede veld geprint hebben of het vijfde veld geprint hebben
            // dan gaan we naar de volgende regel
            if (fieldIndex == 2 || fieldIndex == 5) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
