package singleton.gangof4;

import abstractfactory.gangof4.MazeFactory;
import abstractfactory.gangof4.mapsites.factory.BombedMazeFactory;
import abstractfactory.gangof4.mapsites.factory.EnchantedMazeFactory;

public class MazeFactoryService {
    private static MazeFactory mazeFactory;

    public static MazeFactory getInstance(String type){
        if(mazeFactory == null){
            if (type.equals("Bombed")){
                mazeFactory = new BombedMazeFactory();
            }

            if (type.equals("Enchanted")){
                mazeFactory = new EnchantedMazeFactory();
            }
        }
        return mazeFactory;
    }
}
