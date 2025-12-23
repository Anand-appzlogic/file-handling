package com.file;

import java.util.Map;
import java.util.Properties;
import org.testng.annotations.Test;

public class TestConfig {

    @Test
    public void readConfigTest() {
    	
        ReadConfigFile reader = new ReadConfigFile(); 
        Properties prop = reader.getProperties();     

        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");

        System.out.println("Browser from test: " + browser);
        System.out.println("URL from test    : " + url);
        System.out.println("Username from test: " + username);
    }
    
    @Test
    public void readCSVTest() {
        Map<String, String> csv = new ReadCSVFile().getConfig();
        System.out.println("CSV File: " + csv);
    }
    
    @Test
    public void readJSONTest() {
        Map<String, String> json = new ReadJSONFile().getConfig();
        System.out.println("JSON File: " + json);
    }
    
    @Test
    public void readYAMLTest() {
        Map<String, String> yaml = new ReadYAMLFile().getConfig();
        System.out.println("YAML File: " + yaml);
    }
    
    
}
