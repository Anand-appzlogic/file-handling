package com.file;

import java.io.InputStream;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONFile {

    public Map<String, String> getConfig() {
        Map<String, String> data = null;
        try {
            InputStream is = ReadJSONFile.class
            		.getClassLoader()
            		.getResourceAsStream("config.json");
            
            ObjectMapper mapper = new ObjectMapper();
            data = mapper.readValue(is, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}

