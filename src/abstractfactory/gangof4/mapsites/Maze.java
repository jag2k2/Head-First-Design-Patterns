package abstractfactory.gangof4.mapsites;

public interface Maze extends MapSite {
    void addRoom(Room room);
    int getRoomCount();
    Room getRoom(int roomNum);
}
