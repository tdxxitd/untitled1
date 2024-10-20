public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
    }

    public Warrior() {
        super(270, 30, "CRITICAL DAMAGE");
        System.out.println("Warrior применил суперспособность " + superPower);
    }
}