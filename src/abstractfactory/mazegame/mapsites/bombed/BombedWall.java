package abstractfactory.mazegame.mapsites.bombed;

import abstractfactory.mazegame.mapsites.Wall;

public class BombedWall implements Wall {
    @Override
    public void Enter() {
        System.out.println("Ouch! Ran into the wall!");
    }
}
