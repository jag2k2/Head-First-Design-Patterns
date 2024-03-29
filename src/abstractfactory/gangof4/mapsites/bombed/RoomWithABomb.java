package abstractfactory.gangof4.mapsites.bombed;

import abstractfactory.gangof4.mapsites.Direction;
import abstractfactory.gangof4.mapsites.MapSite;
import abstractfactory.gangof4.mapsites.Room;

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
