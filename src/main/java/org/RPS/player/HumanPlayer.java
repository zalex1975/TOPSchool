package org.RPS.player;

import org.RPS.game.Figure;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }
    public static HumanPlayer createPlayer(){
        System.out.println("Введите своё имя:");
        Scanner in = new Scanner(System.in);
        String _name = in.next();
        return new HumanPlayer(_name);
    }

    @Override
    public void choiceFigure() {
        System.out.println("Выберите номер фигуры:");
        Figure.printFigures();

        Figure tmpFigure = null;

        Scanner in = new Scanner(System.in);
        do {
            int numFigure = -1;

                numFigure = in.nextInt();

            tmpFigure = Figure.getFigure(numFigure);
            if (tmpFigure == null)
                System.out.println("Неверно выбрана фигура");
        } while (tmpFigure == null);

        setCurrentFigure(tmpFigure);
    }

}
