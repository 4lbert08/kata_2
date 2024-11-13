package software.ulpgc.app;

import software.ulpgc.arquitecture.io.FileDinosaurLoader;
import software.ulpgc.arquitecture.io.CsvDinosaurDeserializer;
import software.ulpgc.arquitecture.model.Dinosaur;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Universidad\\3º\\IS2\\katas\\kata2\\archive\\data.csv");
        List<Dinosaur> dinosaurs = new FileDinosaurLoader(file, new CsvDinosaurDeserializer()).load();
        Map<String, Integer> dietscount = new HashMap<>();
        Map<String, Integer> periodscount = new HashMap<>();
        for (Dinosaur dinosaur: dinosaurs) {
            System.out.println(dinosaur);
            dietscount.put(dinosaur.getDiet(), dietscount.getOrDefault(dinosaur.getDiet(), 0)+1);
            periodscount.put(dinosaur.getPeriod(), periodscount.getOrDefault(dinosaur.getPeriod(), 0)+1);
        }
        System.out.println("\nDietsCount:");
        for (String diet: dietscount.keySet()){
            System.out.println(diet + ": " + dietscount.get(diet));
        }
        System.out.println("\nPeriodsCount:");
        for (String period: periodscount.keySet()){
            System.out.println(period + ": " + periodscount.get(period));
        }
    }
}
