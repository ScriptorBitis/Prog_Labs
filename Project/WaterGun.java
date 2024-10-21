import ru.ifmo.se.pokemon.*;

public class WaterGun extends SpecialMove {
    public WaterGun() {
        super(Type.WATER,40,100);
    }
    //Water Gun deals damage with no additional effect.
    //мда-а-а-а-а

    @Override
    protected String describe() {
        return "Применяет WaterGun";
    }
}

