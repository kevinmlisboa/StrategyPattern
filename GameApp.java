import java.util.Arrays;

public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character("Knight", new SwingSword(), Arrays.asList(new Shield(), new Dodge(), new CreateMagic()));
        Character wizard = new Character("Wizard", new CastSpell(), Arrays.asList(new CreateMagic()));
        Character archer = new Character("Archer", new ShootArrow(), Arrays.asList(new Dodge()));

        System.out.println("Knight:");
        knight.attack();
        knight.defend();

        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();

        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();
    }
}