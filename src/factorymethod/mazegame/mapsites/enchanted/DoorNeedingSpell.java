package factorymethod.mazegame.mapsites.enchanted;

import factorymethod.mazegame.mapsites.Door;
import factorymethod.mazegame.mapsites.Room;

public class DoorNeedingSpell implements Door {
    private final Room room1;
    private final Room room2;

    public DoorNeedingSpell(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void Enter() {

    }
}
