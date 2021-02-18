package com.mot.challenge2.helper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
public class ResourceHelper {

    public static <T> T getDataYml(String dataFileName, Class<T> objectClass) {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try {
            return objectMapper.readValue(new File(dataFileName),objectClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
