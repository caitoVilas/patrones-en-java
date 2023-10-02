package org.example.creacionales.abstract_factory;

public class MagicianFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizzardStaf();
    }
}
