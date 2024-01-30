package main.resources.java.repository;


import main.resources.java.model.Guitar;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryRepository {

    private static final String DATABASE_FILE_PATH = "guitars_database.txt";

    public void addGuitar(Guitar guitar) {
        try (FileWriter writer = new FileWriter(DATABASE_FILE_PATH, true)) {
            writer.write(guitar.toString() + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars)
        {
            if (guitar.getSerialNumber().equals(serialNumber))
                return guitar;
        }
        return null;
    }

    public List<Guitar> search(Guitar searchCriteria) {
        for(int i = 0; i < Files.lines(Path.of(DATABASE_FILE_PATH)).size(); i++)
        {
            if(Files.lines(Path.of(DATABASE_FILE_PATH)).get(i) == g)
                return(Files.lines(Path.of(DATABASE_FILE_PATH)).get(i));
        }
        return(null);
    }


}
