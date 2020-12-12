package ya.kremer.IOChamber;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Write the path to the file: ");
            String userString = Input.scan();
            TextFileReader.textOutput(userString);
        } catch (FileNotFoundException exception) {
            String userString = "The file is not recognized. Enter your messages: ";
            System.out.println(userString);
            ArrayList<String> lisOfUserStrings = new ArrayList<>();
            while (!userString.equals("")){
                userString = Input.scan();
                Record.write(lisOfUserStrings, userString);
            }
            int i = 1;
            for (String x : lisOfUserStrings){
                if (i % 2 != 0){
                i++;
                System.out.println(x);
                }
                else {i += 1;}
            }
//            Output.outputting(lisOfUserStrings);
        } catch (IOException exception) {
            System.out.println("Something's wrong");
        }
    }
}

