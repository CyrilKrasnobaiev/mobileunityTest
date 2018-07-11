package utility;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesReader {

    public Properties properties;

    public PropertiesReader(String file){
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            properties = new Properties();
            if (file.contains(".properties")){
                try {
                    properties.load(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    properties.load(new InputStreamReader(inputStream, "UTF-8"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    public String getPropVal(String propName){
        return properties.getProperty(propName);
    }


    public Properties getProperties() {
        return this.properties;
    }

}
