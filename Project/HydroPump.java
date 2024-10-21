import ru.ifmo.se.pokemon.*;

//Changes
//In Generations 1-5, Hydro Pump has 120 base power.??????????????? ЧЕ
public class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER,110,80);
    }
    //Effects
    //Hydro Pump deals damage with no additional effect.


    //КАКОГО БЛЯДСКОГО ХУЯ ТУТ super.describe А? НУ ПОЧЕМУ?
    // использовал cntrl+O
    @Override
    protected String describe() {
        return "Применяет Hydro Pump";
    }
}

