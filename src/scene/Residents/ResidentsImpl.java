package scene.Residents;

import scene.IllegalArgumentException;
import scene.entities.Creatures.Creature;
import scene.entities.Creatures.CreatureImpl;

import java.util.List;
import java.util.Objects;

public class ResidentsImpl implements Resident{
    String name;
    String place;

    List<Creature> creatures;

    public ResidentsImpl(String name, String place, List<Creature> creatures) {
        this.name = name;
        this.place = place;
        this.creatures = creatures;

        validate();
    }

    public interface Cases {
        String getInfinCase();

    }
public Cases getCases () {
        //local class
    class ResidentsCases implements Cases {
        final String name = ResidentsImpl.this.name;

        @Override
        public String getInfinCase() {
            return this.name;
        }
    }
    return new ResidentsCases();
}

   @Override
   public String getName(){
        return this.name;
   }
   @Override
    public String getPlace(){
        return this.place;
    }
    @Override
    public void validate() throws IllegalArgumentException {
        if (creatures == null || creatures.isEmpty()) throw new IllegalArgumentException("residents of moon must be non-empty");
    }

    @Override
    public List<Creature> getCreatures() {
        return this.creatures;
    }
    @Override
    public String toString() {
        return "Жители {" +
                "name='" + name + '\'' +
                ", residents=" + creatures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResidentsImpl another = (ResidentsImpl) o;
        return this.name.equals(another.name) &&
                this.creatures.equals(another.creatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creatures);
    }

}
