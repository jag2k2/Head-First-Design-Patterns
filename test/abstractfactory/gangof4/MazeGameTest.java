package abstractfactory.gangof4;

import abstractfactory.gangof4.mapsites.Maze;
import abstractfactory.gangof4.mapsites.factory.BombedMazeFactory;
import abstractfactory.gangof4.mapsites.factory.EnchantedMazeFactory;
import org.junit.jupiter.api.Test;

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