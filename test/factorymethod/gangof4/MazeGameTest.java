package factorymethod.gangof4;

import org.junit.jupiter.api.*;
import factorymethod.gangof4.mapsites.*;

class MazeGameTest {

    @Test
    void canCreateBombedMaze() {
        MazeGame mazeGame = new BombedMazeGame();
        Maze maze = mazeGame.createMaze();
        System.out.println("Number of rooms: " + maze.getRoomCount());
    }

    @Test
    void canCreateEnchantedMaze(){
        MazeGame mazeGame = new EnchantedMazeGame();
        Maze maze = mazeGame.createMaze();
        System.out.println("Number of rooms: " + maze.getRoomCount());
    }
}