package scene.entities.Creatures;

import scene.entities.Creatures.CreatureImpl;
import scene.entities.Creatures.Gender;

public class Creatures {
    public static class Korotyski extends CreatureImpl {
        private Korotyski(){
            super("Которыши", 30, Gender.MALE);
        }
        private static Korotyski instance = null;

        public static Korotyski getInstance() {
            if (instance == null) instance = new Korotyski();
            return instance;
        }

    }

    public static class Lunatiki extends CreatureImpl {
        private Lunatiki(){
            super("Лунатики", 30, Gender.MALE);
        }
        private static Lunatiki instance = null;

        public static Lunatiki getInstance() {
            if (instance == null) instance = new Lunatiki();
            return instance;
        }

    }

    public static class Earth extends CreatureImpl {
        private Earth(){
            super("Земля",30000000, Gender.MALE);
        }
        private static Earth instance = null;

        public static Earth getInstance() {
            if (instance == null) instance = new Earth();
            return instance;
        }
}
    public static class Moon extends CreatureImpl {
        private Moon(){
            super("Луна",30000000, Gender.MALE);
        }
        private static Moon instance = null;

        public static Moon getInstance() {
            if (instance == null) instance = new Moon();
            return instance;
        }
    }
    public static class Existors extends CreatureImpl {
        private Existors(){
            super("Разумные существа",30, Gender.MALE);
        }
        private static Existors instance = null;

        public static Existors getInstance() {
            if (instance == null) instance = new Existors();
            return instance;
        }
    }
    public static class We extends CreatureImpl {
        private We(){
            super("Мы",30, Gender.MALE);
        }
        private static We instance = null;

        public static We getInstance() {
            if (instance == null) instance = new We();
            return instance;
        }
    }

    public static class Weather extends CreatureImpl {
        private Weather(){
            super("Воздух",3939399, Gender.MALE);
        }
        private static Weather instance = null;

        public static Weather getInstance() {
            if (instance == null) instance = new Weather();
            return instance;
        }
    }

    public static class Znayka extends CreatureImpl {
        private Znayka(){
            super("Знайка",25, Gender.MALE);
        }
        private static Znayka instance = null;

        public static Znayka getInstance() {
            if (instance == null) instance = new Znayka();
            return instance;
        }
    }

    public static class Zvezdochkin extends CreatureImpl {
        private Zvezdochkin(){
            super("профессор Звездочкин",25, Gender.MALE);
        }
        private static Zvezdochkin instance = null;

        public static Zvezdochkin getInstance() {
            if (instance == null) instance = new Zvezdochkin();
            return instance;
        }
    }
}
