package Helppers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by dima on 28.10.16.
 */
public class WorkWithPropertyFile {


    public static Properties createProperti()  {
        FileInputStream fis = null;
        Properties properties = new Properties();

        try {
//            fis = new FileInputStream("c:\\TestMuseum\\config.properties");
                            fis=new FileInputStream("/Users/dima/Desktop/Мои Доки/JAVA/testMuseum/src/main/resources/config.properties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
