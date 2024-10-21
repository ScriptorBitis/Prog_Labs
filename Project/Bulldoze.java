import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND,60,100);

    }
    //Bulldoze deals damage and lowers the target's Speed by one stage.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED,-1);
    }
    
    @Override
    protected String describe() {
        return "Применяет Bulldoze";
    }
}
