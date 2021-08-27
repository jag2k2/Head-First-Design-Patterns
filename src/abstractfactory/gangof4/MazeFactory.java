package abstractfactory.gangof4;

import abstractfactory.gangof4.mapsites.Door;
import abstractfactory.gangof4.mapsites.Maze;
import abstractfactory.gangof4.mapsites.Room;
import abstractfactory.gangof4.mapsites.Wall;

public interface MazeFactory {
    Maze makeMaze();
    Wall makeWall();
    Room makeRoom(int roomNum);
    Door makeDoor(Room room1, Room room2);
}
