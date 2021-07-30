package factorymethod.mazegame;

import factorymethod.mazegame.mapsites.Door;
import factorymethod.mazegame.mapsites.Maze;
import factorymethod.mazegame.mapsites.Room;
import factorymethod.mazegame.mapsites.Wall;
import factorymethod.mazegame.mapsites.bombed.BombedWall;
import factorymethod.mazegame.mapsites.bombed.RoomWithABomb;
import factorymethod.mazegame.mapsites.shared.SimpleDoor;
import factorymethod.mazegame.mapsites.shared.SimpleMaze;

public class BombedMazeGame extends MazeGame {
    @Override
    Maze makeMaze() {
        return new SimpleMaze();
    }

    @Override
    Room makeRoom(int roomNum) {
        return new RoomWithABomb(roomNum);
    }

    @Override
    Wall makeWall() {
        return new BombedWall();
    }

    @Override
    Door makeDoor(Room room1, Room room2) {
        return new SimpleDoor(room1, room2);
    }
}
