package org.RPS.player;

import org.RPS.game.Figure;

public class PCPlayer extends Player {

    public PCPlayer(String name) {
        super(name);
    }

    @Override
    public void choiceFigure() {
        setCurrentFigure(Figure.getFigure());
    }
}
