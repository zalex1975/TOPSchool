package org.RPS;

import org.RPS.game.GameController;
import org.RPS.menu.GameMenu;

public class AppContext {
    private final GameMenu gameMenu;

    public AppContext (){
        GameController gameController = new GameController();
        gameMenu = new GameMenu(gameController);
    }

    public void run(){
        gameMenu.run();
    };
}
