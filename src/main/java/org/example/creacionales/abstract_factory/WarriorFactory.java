package org.example.creacionales.abstract_factory;

public class WarriorFactory extends EnemyAbstractFactory{

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Ace();
    }
}
