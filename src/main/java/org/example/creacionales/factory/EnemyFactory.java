package org.example.creacionales.factory;

public class EnemyFactory {
    public Enemy createEnemy(String type){
        if (type.equalsIgnoreCase("warrior"))
            return new Warriror();
        else if (type.equalsIgnoreCase("magician"))
            return new Magician();
        else
            return null;
    }
}
