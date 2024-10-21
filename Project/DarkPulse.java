import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse(){
        super(Type.DARK,80,100);

    }
    //Dark Pulse deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved).
    //
    //Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.
    //Inner Focus в доках нет => пофиг
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double a = Math.random();
        if (a <= 0.2) {
            Effect.flinch(pokemon);
            System.out.println("Срабатывает шанс в 20%, добавляя эффект \"страх\"!");
        }
    }

    @Override
    protected String describe() {
        return "Использует Dark Pulse";
    }
}
