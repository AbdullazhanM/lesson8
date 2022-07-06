package players;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private SuperAbility superAbility;
    private String heroName;

    public Hero(int health, int damage, SuperAbility superAbility, String heroName) {
        super(health, damage);
        this.superAbility = superAbility;
        this.heroName = heroName;
    }

    public SuperAbility getSupperAbility() {
        return superAbility;
    }

    public void setSupperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
