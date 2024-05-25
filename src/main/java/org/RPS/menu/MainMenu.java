package org.RPS.menu;

import java.util.*;

public class MainMenu extends Menu {
    public MainMenu(){
        menu.put("1", "Начать игру");
        menu.put("2", "Таблица лидеров");
        menu.put("3", "Выход");
        System.out.println("Добро пожаловать в игру");
        System.out.println("Камень ножницы бумага\n");
    }
}
