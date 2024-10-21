import ru.ifmo.se.pokemon.*;

public final class Gourgeist extends Pumpkaboo {
    public  Gourgeist (String name, int level){
        super(name,level);
        setStats(65,90,122,58,75,84);
        setType(Type.GHOST,Type.GRASS);
        //setMove(new Astonish(),new RockSlide(), new DarkPulse(),new FocusBlast());
        addMove(new FocusBlast());
        //лучще addMove, потому что Gourgeist-наследник Pumpkaboo :з
    }
}
