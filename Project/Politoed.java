import ru.ifmo.se.pokemon.*;

public final class Politoed extends Poliwhirl {
    public Politoed(String name, int level) {
        super(name, level);
        setStats(90, 75, 75, 90, 100, 70);
        setType(Type.WATER);
        //setMove(new Hypnosis(), new Waterfall(),new Water Gun(),new Bulldoze());
        setMove(new Bulldoze());
        //наследование же)

    }
}
