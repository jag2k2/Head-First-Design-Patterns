package singleton.headfirst;

public class ChocolateBoilerImp implements Boiler {
    private static Boiler boilerInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerImp(){
        empty = true;
        boiled = false;
    }
    public static Boiler getInstance() {
        if (boilerInstance == null){
            boilerInstance = new ChocolateBoilerImp();
        }
        return boilerInstance;
    }

    @Override
    public void fill() {
        empty = false;
    }

    @Override
    public void boil() {
        boiled = true;
    }
}
