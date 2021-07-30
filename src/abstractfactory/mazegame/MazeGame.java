package abstractfactory.mazegame;

import abstractfactory.mazegame.mapsites.Maze;
import abstractfactory.mazegame.mapsites.Direction;
import abstractfactory.mazegame.mapsites.Door;
import abstractfactory.mazegame.mapsites.Room;

public class MazeGame {

    public Maze createMaze(MazeFactory mazeFactory){
        Maze maze = mazeFactory.makeMaze();
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(2);
        Door theDoor = mazeFactory.makeDoor(room1, room2);

        room1.setSide(Direction.NORTH, mazeFactory.makeWall());
        room1.setSide(Direction.EAST, theDoor);
        room1.setSide(Direction.SOUTH, mazeFactory.makeWall());
        room1.setSide(Direction.WEST, mazeFactory.makeWall());

        room1.setSide(Direction.NORTH, mazeFactory.makeWall());
        room1.setSide(Direction.EAST, mazeFactory.makeWall());
        room1.setSide(Direction.SOUTH, mazeFactory.makeWall());
        room1.setSide(Direction.WEST, theDoor);

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}
