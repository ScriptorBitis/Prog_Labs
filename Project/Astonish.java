import ru.ifmo.se.pokemon.*;


public class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 100);
    }
    //Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).
    //Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.
    // flinch?Ща все будет
    //Inner Focus в доках нет => пофиг

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double a = Math.random();
        if (a <= 0.3) {
            Effect.flinch(pokemon);
            System.out.println("Срабатывает шанс в 30%, добавляя эффект \"страх\"!");
        }
    }

    @Override
    protected String describe() {
        return "Применяет Astonish";
    }
}