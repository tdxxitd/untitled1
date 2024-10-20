public abstract class Hero implements HavingSuperAbility {
    public int health;
    public int damage;
    String superPower;
    public Hero (int health, int damage , String superPower){
        this.damage=damage;
        this.health=health;
        this.superPower=superPower;
    }

}