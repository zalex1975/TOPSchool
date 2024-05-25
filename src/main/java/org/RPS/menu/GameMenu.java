package org.RPS.menu;

import org.RPS.game.GameController;
import org.RPS.game.gameoptions.PCvsHuman;
import org.RPS.game.gameoptions.PCvsPC;

public class GameMenu {
    private final Menu mainMenu = new MainMenu();
    private final Menu playMenu = new PlayMenu();
    private GameController gc;

    public GameMenu (GameController gameController ) {
        gc = gameController;
    }

    public void  run() {
        while (true) {
            mainMenu();
        }
    }
    private void mainMenu() {
        String caseMenu = mainMenu.get();
        switch (caseMenu) {
            case "1" -> playMenu();
            case "2" -> {}//menu.printLeaderboardMenu();
            case "3" -> System.exit(0);
        }
    }

    private void playMenu() {
        String caseMenu = playMenu.get();
        switch (caseMenu) {
            case "1" -> gc.Start(new PCvsPC());
            case "2" -> gc.Start(new PCvsHuman());
            case "3" -> {
                return;
            }
        }
    }
}
