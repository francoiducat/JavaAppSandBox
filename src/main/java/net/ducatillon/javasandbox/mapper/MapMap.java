package net.ducatillon.javasandbox.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MapMap {

    public static void main(String[] args) {

        String jsonString = getJsonFromFile("json/", "data", ".json");
        System.out.println("jsonString = " + jsonString);
        ObjectMapper mapper = new ObjectMapper();

        try {
            User user = mapper.readValue(jsonString, User.class);
            System.out.println("user = " + user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        FileReaderUtil reader = new FileReaderUtil();
        User user = reader.read("json/", "data", ".json", User.class);
        System.out.println("id = " + user.id);
        System.out.println("firstName = " + user.firstName);
        System.out.println("lastName = " + user.lastName);
    }

    public static String getJsonFromFile(final String path, final String fileName, String extension) {


        final InputStream inputStream = MapMap.class.getClassLoader()
                .getResourceAsStream(path + fileName + extension);

        try {
            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
