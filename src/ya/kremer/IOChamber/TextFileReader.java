package ya.kremer.IOChamber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {

    public static void textOutput(String inputFileName) throws IOException {
//        String inputFileName = "./src/ya/kremer/IOChamber/file.txt";
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                if (i % 2 != 0){
                System.out.println(line);
                i += 1;
                }
                else {i+=1;}
            }
    }
}
//
//    public static void example(){
//        List<String> list = new ArrayList<>(Arrays.asList("12", "22", "32", "", "40", "50", ""));
//        List<Boolean> listAfterStream = list.stream().map(String::isBlank).collect(Collectors.toList());
//        System.out.println(listAfterStream);
//    }




