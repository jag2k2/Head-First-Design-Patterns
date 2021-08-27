package factorymethod.gangof4.mapsites.enchanted;

import factorymethod.gangof4.mapsites.Door;
import factorymethod.gangof4.mapsites.Room;

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
