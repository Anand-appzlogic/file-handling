package com.file;

import java.io.InputStream;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class ReadYAMLFile {

    public Map<String, String> getConfig() {
        Map<String, String> data = null;
        try {
            InputStream is = ReadYAMLFile.class.getClassLoader()
            		.getResourceAsStream("config.yaml");
            Yaml yaml = new Yaml();
            data = yaml.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}

