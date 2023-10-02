package org.example.creacionales.abstract_factory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor ha = factory.createArmor();
        Weapon w = factory.createWeapon();
        warrior.attack();
        ha.protect();
        w.damage();

        factory = new MagicianFactory();
        Enemy magician = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon w2 = factory.createWeapon();
        magician.attack();
        robe.protect();
        w2.damage();
    }
}
