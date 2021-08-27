package abstractfactory.gangof4.mapsites.factory;

import abstractfactory.gangof4.MazeFactory;
import abstractfactory.gangof4.mapsites.Door;
import abstractfactory.gangof4.mapsites.Maze;
import abstractfactory.gangof4.mapsites.Room;
import abstractfactory.gangof4.mapsites.Wall;
import abstractfactory.gangof4.mapsites.enchanted.DoorNeedingSpell;
import abstractfactory.gangof4.mapsites.enchanted.EnchantedRoom;
import abstractfactory.gangof4.mapsites.shared.SimpleMaze;
import abstractfactory.gangof4.mapsites.shared.SimpleWall;

public class EnchantedMazeFactory implements MazeFactory {
    @Override
    public Maze makeMaze() {
        return new SimpleMaze();
    }

    @Override
    public Wall makeWall() {
        return new SimpleWall();
    }

    @Override
    public Room makeRoom(int roomNum) {
        return new EnchantedRoom(roomNum);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    }
}
