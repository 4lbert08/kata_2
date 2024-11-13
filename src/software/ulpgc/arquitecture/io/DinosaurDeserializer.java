package software.ulpgc.arquitecture.io;

import software.ulpgc.arquitecture.model.Dinosaur;

public interface DinosaurDeserializer {
    Dinosaur deserialize(String line);
}
