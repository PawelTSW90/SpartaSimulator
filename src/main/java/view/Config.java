package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    // src/main/resources/config.properties
    private static final Properties config;

    static {
        config = new Properties();
        try {
            config.load(new BufferedReader(new FileReader("config.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static double centresPerMonth() {
//        return config.getProperty("centresPerMonth");
//    }
}