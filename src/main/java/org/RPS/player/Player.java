package org.RPS.player;


import org.RPS.game.Figure;

public abstract class Player {
    private final String name;
    private int score;
    private Figure currentFigure;
    private Figure lastFigure;

    Player(String _name) {
        name = _name;
    }

    protected void setCurrentFigure(Figure _currentFigure){
        currentFigure = _currentFigure;
    }

    public Figure getCurrentFigure(){
        return currentFigure;
    }


    public String getName(){
        return name;
    }

    public void setScore(int _score){
        score = _score;
    }

    public int getScore(){
        return score;
    }

    public void playerReset() {
        score = 0;
        currentFigure = null;
    }

    public abstract void choiceFigure();

}


