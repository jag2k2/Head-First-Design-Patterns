package singleton.gangof4;

public class MazeFactoryImp {
    private static MazeFactoryImp mazeFactory;

    protected MazeFactoryImp(){};

    public static MazeFactoryImp getInstance(){
        if(mazeFactory == null){
            mazeFactory = new MazeFactoryImp();
        }
        return mazeFactory;
    }
}
