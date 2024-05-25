package org.RPS.game.gameoptions;

import org.RPS.player.HumanPlayer;
import org.RPS.player.PCPlayer;
import org.RPS.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PCvsHuman implements Players {
    @Override
    public List<Player> getPlayer() {
        List<Player> players = new ArrayList<>();
        players.add(HumanPlayer.createPlayer());
        players.add(new PCPlayer("PC"));
        return players;
    }
}
