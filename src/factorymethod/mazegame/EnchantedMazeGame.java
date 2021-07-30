package factorymethod.mazegame;

import factorymethod.mazegame.mapsites.Door;
import factorymethod.mazegame.mapsites.Maze;
import factorymethod.mazegame.mapsites.Room;
import factorymethod.mazegame.mapsites.Wall;
import factorymethod.mazegame.mapsites.enchanted.DoorNeedingSpell;
import factorymethod.mazegame.mapsites.enchanted.EnchantedRoom;
import factorymethod.mazegame.mapsites.shared.SimpleMaze;
import factorymethod.mazegame.mapsites.shared.SimpleWall;

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
