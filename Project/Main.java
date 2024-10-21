import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main (String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Alomomola("", 60);
        Pokemon p2 = new Pumpkaboo("", 60);
        Pokemon p3 = new Gourgeist("", 60);
        Pokemon p4 = new Poliwag("", 60);
        Pokemon p5 = new Poliwhirl("", 80);
        Pokemon p6 = new Politoed("", 80);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}
