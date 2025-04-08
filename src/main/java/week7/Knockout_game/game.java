package week7.Knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class game {
    private diceCup diceCup;
    private List<player> players;


    public static void main(String[] args) {
        game knockout = new game();
        knockout.startGame();

    }
    public void startGame() {
        //make players
        //get knockout numbers
        //create dice
        //play game
        //each player rolling dice- turn
        // print winner
        diceCup = new diceCup(2);
        int numberofPlayers = positiveIntInput("how many players are there?");
        createPlayers(numberofPlayers);
        setKnockoutNumbers();

        play();

        printGameresults();



    }
    private void createPlayers(int numberofPlayers) {
        players = new ArrayList<>();
        for (int i = 0; i < numberofPlayers; i++) {
            String playerName = stringInput("enter player name: " + i + "'s name");
            player player = new player(playerName);
            players.add(player);
        }
    }
    private void setKnockoutNumbers() {
        for (player p : players) {
            int knockoutnumber;
            do {
                knockoutnumber = intInput("player" + p.getName() + ", enter knockout number. "
                + "it must be between 6, 7 ,8 or 9. ");
            }while (knockoutnumber < 6 || knockoutnumber >9);
            p.setKnockoutNumber(knockoutnumber);
        }
    }
    private void play() {
        int playerindex = 0;
        int totalplayers = players.size();
        while (moreThanOneplayerInplay()) {
            player currentplayer = players.get(playerindex);

            if (currentplayer.isKnockedOut()) {
                System.out.println("Player " + currentplayer.getName() + " is knocked out.");
            }else {
              stringInput("player " + currentplayer.getName() + " press enter to roll. ");
              String turnresult = currentplayer.playTurn(diceCup);
              System.out.println(turnresult);
            }
            playerindex = (playerindex + 1) % totalplayers;

        }
    }
    private boolean moreThanOneplayerInplay(){
        int totalinplay = 0;
        for (player p : players) {
            if (!p.isKnockedOut()) {
                totalinplay++;
            }

        }
        System.out.println("there are " + totalinplay + " players in the game.");
        if (totalinplay > 1) {
            return true;
        }else {
            return false;
        }

    }

    private void printGameresults() {
        for (player player : players) {
            if (player.isKnockedOut()) {
                stringInput("Player " + player.getName() + " is knocked out.");
            }else {
                System.out.println("Player " + player.getName() + " is the winner!");
            }
        }
    }




}
