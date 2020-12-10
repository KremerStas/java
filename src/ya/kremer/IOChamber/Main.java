package ya.kremer.IOChamber;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            String userString = Input.scan();
            TextFileReader.textOutput(userString);
        } catch (FileNotFoundException exception) {
            String userString = "Файл не распознан. Введите ваши сообщения: ";
            System.out.println(userString);
            ArrayList<String> lisOfUserStrings = new ArrayList<>();
            while (!userString.equals("")) {
                userString = Input.scan();
                Record.write(lisOfUserStrings, userString);
            }
            Output.outputting(lisOfUserStrings);
        } catch (IOException exception) {
            System.out.println("Something's wrong");
        }
    }
}

