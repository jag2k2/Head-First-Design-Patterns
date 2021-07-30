package abstractfactory.mazegame.mapsites.bombed;

import abstractfactory.mazegame.mapsites.Direction;
import abstractfactory.mazegame.mapsites.MapSite;
import abstractfactory.mazegame.mapsites.Room;

import java.util.EnumMap;
import java.util.Map;

public class RoomWithABomb implements Room {
    private final Map<Direction, MapSite> sides;
    private final int roomNum;

    public RoomWithABomb (int roomNum) {
        this.roomNum = roomNum;
        this.sides = new EnumMap<>(Direction.class);
    }

    @Override
    public void setSide(Direction direction, MapSite mapSite){
        sides.put(direction, mapSite);
    }

    @Override
    public void Enter() {
        System.out.println("Have entered room: " + roomNum);
    }
}