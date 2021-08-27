package factorymethod.gangof4;

import factorymethod.gangof4.mapsites.Door;
import factorymethod.gangof4.mapsites.Maze;
import factorymethod.gangof4.mapsites.Room;
import factorymethod.gangof4.mapsites.Wall;
import factorymethod.gangof4.mapsites.bombed.BombedWall;
import factorymethod.gangof4.mapsites.bombed.RoomWithABomb;
import factorymethod.gangof4.mapsites.shared.SimpleDoor;
import factorymethod.gangof4.mapsites.shared.SimpleMaze;

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
