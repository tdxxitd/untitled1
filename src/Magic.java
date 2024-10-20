public class Magic extends Hero {
    @Override
    public void applySuperAbility() {
    }

    public Magic() {
        super(200,15 , "MAGIC");
        System.out.println("Magician применил суперспособность" + superPower);

    }
}