package abstractfactory.mazegame.mapsites.factory;

import abstractfactory.mazegame.MazeFactory;
import abstractfactory.mazegame.mapsites.Door;
import abstractfactory.mazegame.mapsites.Maze;
import abstractfactory.mazegame.mapsites.Room;
import abstractfactory.mazegame.mapsites.Wall;
import abstractfactory.mazegame.mapsites.enchanted.DoorNeedingSpell;
import abstractfactory.mazegame.mapsites.enchanted.EnchantedRoom;
import abstractfactory.mazegame.mapsites.shared.SimpleMaze;
import abstractfactory.mazegame.mapsites.shared.SimpleWall;

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
