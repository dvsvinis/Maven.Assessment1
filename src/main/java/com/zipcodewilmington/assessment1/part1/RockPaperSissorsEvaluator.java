package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winner = "";

       if (handSign == "rock"){
           winner = "paper";
        }
       else if (handSign == "paper"){
           winner = "scissor";
       }
       else if (handSign == "scissor"){
           winner = "rock";
       }
       else winner = "-1";
       return winner;
    }



    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loser = "";

        if (handSign == "rock"){
            loser = "scissor";
        }
        else if (handSign == "paper"){
            loser = "rock";
        }
        else if (handSign == "scissor"){
            loser = "paper";
        }
        else loser = "-1";

        return loser;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winner = "";
        if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "scissor"){
            winner = "rock";
        }
        else if (handSignOfPlayer1 == "rock" && handSignOfPlayer2 == "paper"){
            winner = "paper";
        }
        else if (handSignOfPlayer1 == "scissor" && handSignOfPlayer2 == "rock"){
            winner = "rock";
        }
        else if (handSignOfPlayer1 == "scissor" && handSignOfPlayer2 == "paper"){
            winner = "paper";
        }
        else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "scissor"){
            winner = "scissor";
        }
        else if (handSignOfPlayer1 == "paper" && handSignOfPlayer2 == "rock"){
            winner = "paper";
        }

        return winner;
    }
}
