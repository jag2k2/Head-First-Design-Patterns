package abstractfactory.gangof4.mapsites.factory;

import abstractfactory.gangof4.MazeFactory;
import abstractfactory.gangof4.mapsites.Door;
import abstractfactory.gangof4.mapsites.Maze;
import abstractfactory.gangof4.mapsites.Room;
import abstractfactory.gangof4.mapsites.Wall;
import abstractfactory.gangof4.mapsites.bombed.BombedWall;
import abstractfactory.gangof4.mapsites.bombed.RoomWithABomb;
import abstractfactory.gangof4.mapsites.shared.SimpleDoor;
import abstractfactory.gangof4.mapsites.shared.SimpleMaze;

public class BombedMazeFactory implements MazeFactory {
    @Override
    public Maze makeMaze() {
        return new SimpleMaze();
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int roomNum) {
        return new RoomWithABomb(roomNum);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new SimpleDoor(room1, room2);
    }
}
