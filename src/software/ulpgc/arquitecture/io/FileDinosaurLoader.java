package software.ulpgc.arquitecture.io;

import software.ulpgc.arquitecture.model.Dinosaur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDinosaurLoader implements DinosaurLoader{
    private final File file;
    private final DinosaurDeserializer deserializer;

    public FileDinosaurLoader(File file, DinosaurDeserializer deserializer) {
        this.file = file;
        this.deserializer = deserializer;
    }

    @Override
    public List<Dinosaur> load() throws IOException {
        List<Dinosaur> dinosaurs = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                dinosaurs.add(deserializer.deserialize(line));
            }
        }
        return dinosaurs;
    }
}
