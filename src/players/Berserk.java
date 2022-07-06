package players;

import General.RPG_Game;

public class Berserk extends Hero{
    public Berserk(int health, int damage,String heroName) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, heroName);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        }


    }

