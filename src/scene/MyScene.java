package scene;

import scene.Residents.Resident;
import scene.Residents.ResidentsImpl;
import scene.entities.Action.Action;
import scene.entities.Action.Actions;
import scene.entities.Creatures.Creature;
import scene.entities.Creatures.Creatures;

import java.util.List;
import java.util.Objects;


public class MyScene extends Scene {
    private final TextBuilder history = TextBuilder.getInstance();
    Creature moon = Creatures.Moon.getInstance();
    Creature lunatiki = Creatures.Lunatiki.getInstance();
    Creature znayka = Creatures.Znayka.getInstance();
    Creature existors = Creatures.Existors.getInstance();
    Creature korotyski = Creatures.Korotyski.getInstance();
    Creature earth = Creatures.Earth.getInstance();
    Creature we = Creatures.We.getInstance();
    Creature weather = Creatures.Weather.getInstance();
    Creature zvezdochkin = Creatures.Zvezdochkin.getInstance();



    @Override
    public String build() throws EmptyStoryException {
        // anonymous class
        final Resident livingplace = new ResidentsImpl("Лунатики/Коротышки", "Луна", List.of(Creatures.Korotyski.getInstance(),Creatures.Lunatiki.getInstance())) {
            @Override
            public String getPlace(){
                return "Луна";
            }
        };

        history.add(znayka.action(new Actions.Understand()), existors.action(new Actions.MakeWalls()), znayka.action(new Actions.Arrive()))
                .add(znayka.action(new Actions.Publish()), korotyski.action(new Actions.Live()), earth.action(new Actions.WasAir()))
                .add(lunatiki.action(new Actions.Live(livingplace.getPlace())), we.action(new Actions.LiveOnEarth()), moon.action(new Actions.BeLess()))
                .add(lunatiki.action(new Actions.MakeShelter()), weather.action(new Actions.UnableToFlyAway()), we.action(new Actions.UnWorry()))
                .add(lunatiki.action(new Actions.GoIntoPlanet()), lunatiki.action(new Actions.LiveInside()), znayka.action(new Actions.MakeNoiseWithBook()))
                .add(korotyski.action(new Actions.ReadWithInterest()), zvezdochkin.action(new Actions.SadBadWords()), zvezdochkin.action(new Actions.StrangeMan()))
                .add(zvezdochkin.action(new Actions.LearnDetails()), zvezdochkin.action(new Actions.MakeAnnouncment()), korotyski.action(new Actions.SeatOnPlace()))
                .add(zvezdochkin.action(new Actions.Cough()), znayka.action(new Actions.Praise()), zvezdochkin.action(new Actions.Say()), korotyski.action(new Actions.NoLive()))
                .add(zvezdochkin.action(new Actions.Additional()));

        if (history.getResult().isBlank()) throw new EmptyStoryException();

        return history.getResult();
    }
    @Override
    public String toString() {
        return "Сцена {" +
                "history=" + history +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyScene myScene = (MyScene) o;
        return Objects.equals(history, myScene.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(history);
    }

}