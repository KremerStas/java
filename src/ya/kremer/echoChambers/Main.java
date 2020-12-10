package ya.kremer.echoChambers;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String userString = "Somebody";
        ArrayList<String> lisOfUserStrings = new ArrayList<>();
        while (!userString.equals("")){
            userString = Input.scan();
            Record.write(lisOfUserStrings, userString);
        }
        Output.outputting(lisOfUserStrings);
    }
}

