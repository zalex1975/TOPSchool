package org.RPS.player.dto;

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;

import org.RPS.player.Player;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class  PlayerDto implements ReadFile, WriteFile, JsonConvert {
    @Override
    public String ReadFile(String path) {
        StringBuilder writer = new StringBuilder();

//        try (FileInputStream stream = new FileInputStream(path)) {
//            int ch;
//            // EOF - конец прочтения файла
//            while ((ch = stream.read()) != -1) {
//                writer.append((char)ch);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл отсутствует");
//        } catch (IOException e) {
//            System.out.println("Ошибка чтения");
//        }
        return writer.toString();
    }
        @Override
    public void WriteFile(String path, String data) {
        try (FileOutputStream stream = new FileOutputStream(path)){
            byte [] buffer = data.getBytes();
            stream.write(buffer, 0, buffer.length);
        } catch (FileNotFoundException e){
            System.out.println("Файл отсутствует");
        } catch (IOException e){
            System.out.println("Ошибка записи");
        }

    }

    @Override
    public String toJson(List<Player> data) {
        StringWriter writer = new StringWriter();
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            mapper.writeValue(writer, data);
//        } catch (IOException e) {
//            System.out.println("Ошибка преобразования");
//        }
        return writer.toString();
    }

    @Override
    public List<Player> fromJson(String jsonString) {
//        ObjectMapper mapper = new ObjectMapper();
        List<Player> list = new ArrayList<>();
//        try {
//            list = mapper.readValue(jsonString, new TypeReference<List<Player>>() {});
//        } catch (JsonProcessingException e) {
//            System.out.println("Ошибка преобразования");
//        }
        return list;
    }


    // чтение и запись файла через интерфейс
    // преобразование данных в json
    //





}
