package abstractfactory.mazegame;

import abstractfactory.mazegame.mapsites.Door;
import abstractfactory.mazegame.mapsites.Maze;
import abstractfactory.mazegame.mapsites.Room;
import abstractfactory.mazegame.mapsites.Wall;

public interface MazeFactory {
    Maze makeMaze();
    Wall makeWall();
    Room makeRoom(int roomNum);
    Door makeDoor(Room room1, Room room2);
}
