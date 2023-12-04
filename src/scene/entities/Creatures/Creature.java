package scene.entities.Creatures;

import scene.entities.Action.Action;
import scene.entities.Interface.Entity;

public interface Creature extends Entity {
    String describe();
    String action(Action action);
    String actionWith(Action action, Creature... creatures);
    Gender getGender();


}
