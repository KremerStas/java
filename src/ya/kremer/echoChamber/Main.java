package ya.kremer.echoChamber;

import ya.kremer.IOChamber.TextFileReader;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String userString = "Something";
        ArrayList<String> lisOfUserStrings = new ArrayList<>();
        while (!userString.equals("")){
            userString = Input.scan();
            Record.write(lisOfUserStrings, userString);
        }
        Output.outputting(lisOfUserStrings);
    }
}

