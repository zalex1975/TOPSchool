package org.RPS.player.dto;

import org.RPS.player.Player;

import java.util.List;

public interface JsonConvert {

    // преобразование данных в json
    // преобразование из json в object

    public String toJson(List<Player> data);
    public List<Player> fromJson(String jsonString);


}
