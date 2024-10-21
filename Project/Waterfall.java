import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.WATER,80,100);

    }
    //Waterfall deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved).
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double a = Math.random();
        if (a <= 0.2) {
            Effect.flinch(pokemon);
            System.out.println("Срабатывает шанс в 20%, добавляя эффект \"страх\"!");
        }
    }
    //так и живем

    @Override
    protected String describe() {
        return "Применяет Waterfall";
    }
}
