package factorymethod.gangof4;

import factorymethod.gangof4.mapsites.Door;
import factorymethod.gangof4.mapsites.Maze;
import factorymethod.gangof4.mapsites.Room;
import factorymethod.gangof4.mapsites.Wall;
import factorymethod.gangof4.mapsites.enchanted.DoorNeedingSpell;
import factorymethod.gangof4.mapsites.enchanted.EnchantedRoom;
import factorymethod.gangof4.mapsites.shared.SimpleMaze;
import factorymethod.gangof4.mapsites.shared.SimpleWall;

public class EnchantedMazeGame extends MazeGame {
    @Override
    Maze makeMaze() {
        return new SimpleMaze();
    }

    @Override
    Room makeRoom(int roomNum) {
        return new EnchantedRoom(roomNum);
    }

    @Override
    Wall makeWall() {
        return new SimpleWall();
    }

    @Override
    Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    }
}
