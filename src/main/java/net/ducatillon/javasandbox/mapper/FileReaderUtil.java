package net.ducatillon.javasandbox.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderUtil {

    private static final Logger logger = Logger.getLogger("logger");

    private ObjectMapper mapper = new ObjectMapper();

    public FileReaderUtil() {
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public <T> T read(String path, String fileName, String extension, Class<T> tClass) {

        final String inputString;

        final InputStream inputStream = FileReaderUtil.class.getClassLoader()
                .getResourceAsStream(path + fileName + extension);

        try {
            inputString = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            throw new RuntimeException(e);
        }

        try {
            return mapper.readValue(inputString, tClass);
        } catch (JsonProcessingException e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }


}
