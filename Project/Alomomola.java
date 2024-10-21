import ru.ifmo.se.pokemon.*;

// cntrl + O
public final class Alomomola extends Pokemon {
    public Alomomola(String name, int level) {
        super(name, level);
        setStats(165, 75, 80, 40, 45, 65);
        setType(Type.WATER);
        setMove(new Poud(), new DoubleTeam(), new HydroPump(), new AquaRing());
    }
}
