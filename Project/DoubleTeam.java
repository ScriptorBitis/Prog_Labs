import ru.ifmo.se.pokemon.*;


public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 1, 100);


    }
    @Override
    protected String describe() {
        return "Применяет Double Team";
    }

    //блядь, как оставить сообщение?
    //блядь, как переопределить класс?
    //Double Team raises the user's Evasiveness by one stage
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, +1);
    }
}


