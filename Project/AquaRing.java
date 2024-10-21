import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    public AquaRing(){
        super(Type.WATER,1,100);
    }
    //я ебал, какие 1/16 hp, вы ебанутые?
    //отмена паники, я разобрался
    //Effects
    //The user of Aqua Ring surrounds itself with a veil of water, which restores 1⁄16 of its maximum HP at the end of each turn.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.getHP();
        pokemon.setMod(Stat.HP,(int)(pokemon.getStat(Stat.HP)*16/100)*(-1) );
        //System.out.println(pokemon.getStat(Stat.HP));
        //гениально решение
    }
    //Честно, это пиздец.Надо бы выучить документацию...
    //Для HP модификатор может иметь любое положительно или отрицательное значение,
    // которое добавляется к значению текущего повреждения поекмона.
    //(положительное - покемон теряет HP, отрицательное - восстанавливает).
    @Override
    protected String describe() {
        return "Применяет Aqua Ring и восстанавливает 1/16 здоровья";
    }
}

