package abstractfactory.mazegame.mapsites.shared;

import abstractfactory.mazegame.mapsites.Door;
import abstractfactory.mazegame.mapsites.Room;

public class SimpleDoor implements Door {
    private Room roomA;
    private Room roomB;
    private boolean isOpen;

    public SimpleDoor(Room roomA, Room roomB){
        this.roomA = roomA;
        this.roomB = roomB;
        this.isOpen = false;
    }

    @Override
    public void Enter() {
        System.out.println("Leaving " + roomA + " and entering " + roomB);
    }
}
