package org.RPS.game.gameoptions;

import org.RPS.player.PCPlayer;
import org.RPS.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PCvsPC implements Players {
    @Override
    public List<Player> getPlayer() {
        List<Player> players = new ArrayList<>();
        players.add(new PCPlayer("PC1"));
        players.add(new PCPlayer("PC2"));
        return players;
    }
}
