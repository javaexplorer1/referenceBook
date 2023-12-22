import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<City> cityList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/main/resources/cities.csv"))) {
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] stringsSplited = string.split(";");
                String[] strings = Arrays.copyOf(stringsSplited, 6);
                for (int i = 0; i < 6; i++) {
                    if (strings[i] == null) {
                        strings[i] = "";
                    }
                }
                cityList.add(new City(strings[1], strings[2], strings[3], Integer.parseInt(strings[4]), strings[5]));
            }
        }
        for (City city : cityList) {
            System.out.println(city);
        }
    }
}
