import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FavouriteAnimals {
    public static void main(String[] args) {
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them

        if (args.length != 0) {
            appendAnimal("./favourites.txt", args[0]);
        } else {
            printAnimals("./favourites.txt");
        }
    }

    public static void appendAnimal(String path, String newFavorite) {
        try {
            Path taskPath = Paths.get(path);
            List<String> favorites = new ArrayList<>();
            favorites.add(newFavorite);
            Files.write(taskPath, favorites, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write file: " + path);
        }
    }

    public static void printAnimals(String path) {
        Path usagePath = Paths.get(path);
        try {
            List<String> allLines = Files.readAllLines(usagePath);
            for (String lines : allLines) {
                System.out.print(lines);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: " + path);
        }
    }
}
