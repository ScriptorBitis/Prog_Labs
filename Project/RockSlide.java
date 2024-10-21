import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK,75,90);
    }
    //Effects
    //Rock Slide deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).
    //Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.
    //Inner Focus не реализлован => пофиг+пофиг

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        double a = Math.random();
        if (a <= 0.3){
            Effect.flinch(pokemon);
            System.out.println("Срабатывает шанс в 30%, добавляя эффект \"страх\"!");
        }
    }

    @Override
    protected String describe() {
        return "Применяет Rock Slide";
    }
}
