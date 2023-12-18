import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<City> cityList = new ArrayList<>();

        Scanner scanner = new Scanner(new File("..\\resources\\cities.csv"));
        scanner.useDelimiter(",");   //delimiter
        while (scanner.hasNext()) {
            String[] strings = scanner.next().split(",");


        }
        scanner.close();

    }
}
