package utility;

import java.util.HashMap;
import java.util.Map;

public class FileReaderService {

    public static Map<String, String> getMap(String fileLocation) {
        PropertiesReader propertyReader = new PropertiesReader(fileLocation);
        return new HashMap(propertyReader.getProperties());
    }

}
