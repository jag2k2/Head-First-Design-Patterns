package abstractfactory.mazegame.mapsites.factory;

import abstractfactory.mazegame.MazeFactory;
import abstractfactory.mazegame.mapsites.Door;
import abstractfactory.mazegame.mapsites.Maze;
import abstractfactory.mazegame.mapsites.Room;
import abstractfactory.mazegame.mapsites.Wall;
import abstractfactory.mazegame.mapsites.bombed.BombedWall;
import abstractfactory.mazegame.mapsites.bombed.RoomWithABomb;
import abstractfactory.mazegame.mapsites.shared.SimpleDoor;
import abstractfactory.mazegame.mapsites.shared.SimpleMaze;

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
