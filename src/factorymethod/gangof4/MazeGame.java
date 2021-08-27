package factorymethod.gangof4;

import factorymethod.gangof4.mapsites.*;

public abstract class MazeGame {
    public Maze createMaze(){
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door theDoor = makeDoor(room1, room2);

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, theDoor);
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, makeWall());

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, makeWall());
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, theDoor);

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }

    //Factory Methods
    abstract Maze makeMaze();
    abstract Room makeRoom(int roomNum);
    abstract Wall makeWall();
    abstract Door makeDoor(Room room1, Room room2);
}
