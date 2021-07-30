package abstractfactory.mazegame.mapsites;

public interface Room extends MapSite {
    void setSide(Direction direction, MapSite mapSite);

}
