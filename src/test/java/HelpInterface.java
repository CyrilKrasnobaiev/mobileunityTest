import java.util.Map;

import static utility.FileReaderService.getMap;

public interface HelpInterface {

    Map<String, String> texts = getMap("properties/errorMessages.txt");
}
