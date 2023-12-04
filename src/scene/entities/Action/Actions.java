package scene.entities.Action;

public class Actions {
    public static class NotAbleToLive extends Action {
        public NotAbleToLive() {
            super("нет возможности существовать");
        }
    }

    public static class ReadWithInterest extends Action {
        public ReadWithInterest() {
            super("читать с увлечением книжку");
        }
    }

    public static class UnableToFlyAway extends Action {
        public UnableToFlyAway() {
            super("нет возможности улетучиться");
        }
    }

    public static class SeatOnPlace extends Action {
        public SeatOnPlace() {
            super("рассесться на стулья");
        }
    }

    public static class StrangeMan extends Action {
        public StrangeMan() {
            super("ценить точность порядок и не терпеть выдумок");
        }
    }

    public static class SadBadWords extends Action {
        public SadBadWords() {
            super("говорить книга чепуха");
        }
    }

    public static class MakeNoiseWithBook extends Action {
        public MakeNoiseWithBook() {
            super("наделать много шума книжкой");
        }
    }

    public static class MakeAnnouncment extends Action {
        public MakeAnnouncment() {
            super("предоставить доклад");
        }
    }

    public static class LiveOnEarth extends Action {
        public LiveOnEarth() {
            super("жить на поверхности нашей планеты Земли");
        }
    }

    public static class LearnDetails extends Action {
        public LearnDetails() {
            super("предложить разобрать книгу по полочкам");
        }
    }

    public static class GoIntoPlanet extends Action {
        public GoIntoPlanet() {
            super("переселяться внутрь Луны");
        }
    }

    public static class MakeShelter extends Action {
        public MakeShelter() {
            super("окружать свои города стенами");
        }
    }

    public static class BeLess extends Action {
        public BeLess() {
            super("иметь меньше воздуха");
        }
    }

    public static class Additional extends Action {
        public Additional() {
            super("сказать никто не иметь возможность жить внутри так как Луна внутри не пустая");
        }
    }

    public static class NoLive extends Action {
        public NoLive() {
            super("не жить на Луне");
        }
    }

    public static class NotDie extends Action {
        public NotDie() {
            super("не погибнуть");
        }
    }

    public static class WasAir extends Action {
        public WasAir() {
            super("иметь воздух");
        }
    }

    public static class Arrive extends Action {
        public Arrive() {
            super("вернуться из путешествия");
        }
    }

    public static class Cough extends Action {
        public Cough() {
            super("громко кашлять и делать доклад");
        }
    }

    public static class Live extends Action {
        String where = "";
        public Live() {
            super("жить ");
        }
        public Live(String where) {
            this();
            this.where = "на " + where;
        }

        @Override
        public String getName() {
            return super.getName() + where;
        }
    }

    public static class LiveInside extends Action {
        public LiveInside() {
            super("жить внутри, а не снаружи планеты");
        }
    }

    public static class MakeWalls extends Action {
        public MakeWalls() {
            super("сделать стены");
        }
    }

    public static class Praise extends Action {
        public Praise() {
            super("хвалить книгу и сказать Знайка допустил ошибку");
        }
    }

    public static class Publish extends Action {
        public Publish() {
            super("опубликовать книжку и писать");
        }
    }

    public static class Say extends Action {
        public Say() {
            super("сказать");
        }
    }

    public static class Understand extends Action {
        public Understand() {
            super("понять");
        }
    }

    public static class UnWorry extends Action {
        public UnWorry() {
            super("не бояться");
        }
    }



}
