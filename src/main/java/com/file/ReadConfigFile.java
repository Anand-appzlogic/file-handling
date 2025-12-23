package com.file;

import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {

    public Properties getProperties() {
        Properties prop = new Properties();
        try {
            InputStream fis = ReadConfigFile.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");
            prop.load(fis);
        } catch (Exception e) {
            System.out.println("Error reading config file");
            e.printStackTrace();
        }
        return prop;
    }
}
