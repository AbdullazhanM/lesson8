package players;

import General.RPG_Game;

public class Warrior extends Hero{
    public Warrior(int health, int damage,String heroName) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, heroName);

    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        int coef = RPG_Game.random.nextInt(5)+2;
        boss.setHealth(boss.getHealth() - this.getDamage()* coef);
        System.out.println(this.getHeroName() + " hits critically: " + this.getDamage() * coef);
    }
}
