import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<String> forWrite = new ArrayList<>();
        try {
            List<String> strings = Files.readAllLines(Paths.get("text.txt"));
            for (String str : strings) {
                StringBuilder str2 = new StringBuilder(str);
                if (str.equals(str2.reverse().toString())) {
                    forWrite.add(str);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(Paths.get("palindromeFromText.txt"), forWrite);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
