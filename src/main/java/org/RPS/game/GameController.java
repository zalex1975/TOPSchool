package org.RPS.game;

import org.RPS.game.gameoptions.Players;
import org.RPS.player.Player;

import java.util.List;

public class GameController {
    private int scoreWin = 3;

    public void setScoreWin(int _scoreWin){
        if(scoreWin > 0)
            scoreWin = _scoreWin;
    }

    private void ShowCurrentFigure(Player p1) {
        System.out.printf("%s: выбросил %s\n", p1.getName(), p1.getCurrentFigure());
    }

    private void SelectFigure(Player player1, Player player2){
        player1.choiceFigure();
        player2.choiceFigure();
    }

    private Player beatsRound(Player player1, Player player2){

        if (player1.getCurrentFigure() == player2.getCurrentFigure())
            return null;
        if (player1.getCurrentFigure().beats(player2.getCurrentFigure()))
            return player1;
        else
            return player2;
    }

    public void Start(Players players) {
        List<Player> playersList = players.getPlayer();
        Player player1 = playersList.get(0);
        Player player2 = playersList.get(1);

        int round = 0;
        while (true){
            round++;
            SelectFigure(player1, player2);
            Player roundWinner = beatsRound(player1, player2);
            ShowCurrentFigure(player1);
            ShowCurrentFigure(player2);
            ShowWinner(roundWinner);
            ShowScore(round, player1.getScore(), player2.getScore());
            if (roundWinner != null && roundWinner.getScore() == scoreWin)
                break;
        }
    }

    private void ShowScore(int round, int P1score, int P2score) {
        System.out.printf("\nРаунд:%d Player1=%d VS Player2=%d\n\n",round, P1score, P2score);
    }

    private void ShowWinner(Player roundWinner) {
        if  (roundWinner == null)
            System.out.println("Никто не выиграл");
        else{
            System.out.printf("%s выиграл раунд\n", roundWinner.getName());
            roundWinner.setScore(roundWinner.getScore() + 1);
        }
    }
}
