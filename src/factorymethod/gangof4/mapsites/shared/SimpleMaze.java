package factorymethod.gangof4.mapsites.shared;

import factorymethod.gangof4.mapsites.Maze;
import factorymethod.gangof4.mapsites.Room;

import java.util.ArrayList;
import java.util.List;

public class SimpleMaze implements Maze {
    private List<Room> rooms;

    public SimpleMaze(){
        this.rooms = new ArrayList<>();
    }

    @Override
    public void addRoom(Room room){
        rooms.add(room);
    }

    @Override
    public int getRoomCount(){
        return rooms.size();
    }

    @Override
    public Room getRoom(int roomNum){
        return null;
    }

    @Override
    public void Enter() {
        System.out.println("You have entered the maze!");
    }
}
