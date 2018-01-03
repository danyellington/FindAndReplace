import models.FindAndReplace;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a sentence");
        try {
            String stringUserInput = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
