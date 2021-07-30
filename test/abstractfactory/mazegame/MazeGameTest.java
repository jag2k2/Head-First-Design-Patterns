package abstractfactory.mazegame;

import abstractfactory.mazegame.mapsites.Maze;
import abstractfactory.mazegame.mapsites.factory.BombedMazeFactory;
import abstractfactory.mazegame.mapsites.factory.EnchantedMazeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeGameTest {

    @Test
    void canCreateBombedMaze(){
        MazeFactory bombMazeFactory = new BombedMazeFactory();
        MazeGame mazeGame = new MazeGame();
        Maze bombMaze = mazeGame.createMaze(bombMazeFactory);
        System.out.println(bombMaze.getRoomCount());
    }

    @Test
    void canCreateEnchantedMaze(){
        MazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        MazeGame mazeGame = new MazeGame();
        Maze enchantedMaze = mazeGame.createMaze(enchantedMazeFactory);
        System.out.println(enchantedMaze.getRoomCount());
    }
}