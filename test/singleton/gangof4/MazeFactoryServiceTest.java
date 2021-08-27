package singleton.gangof4;

import abstractfactory.gangof4.MazeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeFactoryServiceTest {

    @Test
    void canCreateOnlyOneInstance(){
        MazeFactory mazeFactory = MazeFactoryService.getInstance("Bombed");
        assertNotNull(mazeFactory);
        MazeFactory expected = MazeFactoryService.getInstance("Bombed");
        assertEquals(expected, mazeFactory);
    }
}