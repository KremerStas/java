package ya.kremer.echoChambers;

import java.util.List;

public class Record {

    public static List<String> write (List< String> listOfUserStrings, String userString) {
            listOfUserStrings.add(userString);
        return listOfUserStrings;
    }
}

