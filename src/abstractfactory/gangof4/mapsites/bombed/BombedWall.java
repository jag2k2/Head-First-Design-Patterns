package abstractfactory.gangof4.mapsites.bombed;

import abstractfactory.gangof4.mapsites.Wall;

public class BombedWall implements Wall {
    @Override
    public void Enter() {
        System.out.println("Ouch! Ran into the wall!");
    }
}
