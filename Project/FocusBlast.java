import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }
    //Focus Blast deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
    //Stats can be lowered to a minimum of -6 stages each.


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
            System.out.println("Срабатывает шанс в 10%, снижая специальную защиту на 1 ступень!");
        }
    }

    @Override
    protected String describe() {
        return "Применяет Focus Blast";
    }
}

