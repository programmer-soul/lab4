package scene.entities.Creatures;

import scene.entities.Action.Action;
import scene.entities.util.CreatureUtils;
import java.util.Objects;

public class CreatureImpl implements Creature{
    String name;
    int age;
    Gender gender;

    public CreatureImpl(String name,int age, Gender gender) {
        this.name = name;

        this.age = age;
        this.gender = gender;

    }
    @Override
    public String describe() {
        return String.format("%s, %s, %d лет",
                this.name, this.gender.getName(), this.age);
    }

    @Override
    public String action(Action action) {
        return String.join(" ", this.name, "исполнил", action.getName());
    }


    @Override
    public String actionWith(Action action, Creature... creatures) {
        return String.join(" ",CreatureUtils.toString(creatures), "исполнили", action.getName());
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "Человек {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatureImpl creature = (CreatureImpl) o;
        return age == creature.age && Objects.equals(name, creature.name) && gender == creature.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
