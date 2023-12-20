import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<City> cityList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/main/resources/cities.csv"))) {
            scanner.useDelimiter("\\r\\n");   //delimiter
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] strings = string.split(";");
                cityList.add(new City(strings[1], strings[2], strings[3], Integer.parseInt(strings[4]), strings[5]));
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getStackTrace());
        }
        for (City city : cityList) {
            System.out.println(city);
        }

    }
}
