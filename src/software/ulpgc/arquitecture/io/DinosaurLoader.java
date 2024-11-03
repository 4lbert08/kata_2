package software.ulpgc.arquitecture.io;

import software.ulpgc.arquitecture.model.Dinosaur;

import java.io.IOException;
import java.util.List;

public interface DinosaurLoader {
    List<Dinosaur> load() throws IOException;
}
