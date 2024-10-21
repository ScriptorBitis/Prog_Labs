import ru.ifmo.se.pokemon.*;



public class Hypnosis extends StatusMove {
    public Hypnosis(){
        super(Type.PSYCHIC,1,60);
    }
    //Hypnosis puts the target to sleep, if it hits.
    // Sleeping Pokémon cannot move (with some exceptions such as Snore). Sleep lasts for 1-3 turns.

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect.sleep(pokemon);
    }
    // вроде бы все ок

    @Override
    protected String describe() {
        return "Применяет Hypnosis";
    }
}
