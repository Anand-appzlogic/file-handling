package com.file;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ReadCSVFile {

    public Map<String, String> getConfig() {
        Map<String, String> data = new HashMap<>();
        try {
            InputStream is = ReadCSVFile.class
                    .getClassLoader()
                    .getResourceAsStream("config.csv");

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

           
            String headerLine = reader.readLine(); 
            String[] headers = headerLine.split(",");

        
            String dataLine = reader.readLine();
            String[] values = dataLine.split(",");

            for (int i = 0; i < headers.length; i++) {
                data.put(headers[i], values[i]);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
