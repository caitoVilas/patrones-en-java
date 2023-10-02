package org.example.creacionales.factory;

public class TestFactory {

    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();
        Enemy warriror = factory.createEnemy("warrior");
        Enemy magician = factory.createEnemy("magician");
        warriror.attack();
        magician.attack();
    }
}
