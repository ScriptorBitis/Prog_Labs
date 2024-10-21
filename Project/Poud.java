import ru.ifmo.se.pokemon.*;

public class Poud extends PhysicalMove {
    public Poud() {
        super(Type.GHOST, 40, 100);
    }

    @Override
    protected String describe() {
        return "Применяет Poud";
    }
}
