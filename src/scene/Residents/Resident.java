package scene.Residents;

import scene.IllegalArgumentException;
import scene.entities.Creatures.Creature;
import scene.entities.Interface.Entity;

import java.util.List;

public interface Resident extends Entity {
    List<Creature> getCreatures();

    void validate() throws IllegalArgumentException;

    String getPlace();
}
