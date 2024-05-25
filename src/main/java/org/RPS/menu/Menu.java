package org.RPS.menu;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Menu {
    protected Map<String, String> menu = new LinkedHashMap<>();

    public String get() {
        String inKey = "";
        while (true) {
            print();
            inKey = getConsole();
            if (menu.containsKey(inKey))
                break;
            else System.out.println("Выбран неверный пункт меню");
        }
        return inKey;
    }

    private void print() {
        for (String key : menu.keySet()) {
            System.out.println(key + " - " + menu.get(key));
        }
    }

    private String getConsole() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
