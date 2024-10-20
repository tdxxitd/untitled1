public class Medic extends Hero {
    public int healPoints;
    @Override
    public void applySuperAbility()
    {}
    void increaseExperience(){
        healPoints += (int) (healPoints * 0.1);

    }
    public int getHealPoints() {
        return healPoints;
    }

    public Medic() {
        super(250, 15, "TREAT");
        this.healPoints = 50;
        System.out.println("Medic применил суперспособноть " + superPower);
    }
}