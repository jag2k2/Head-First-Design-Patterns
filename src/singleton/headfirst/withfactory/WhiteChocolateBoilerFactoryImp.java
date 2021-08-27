package singleton.headfirst.withfactory;

import singleton.headfirst.Boiler;

public class WhiteChocolateBoilerFactoryImp implements BoilerFactory {
    private Boiler instance;

    @Override
    public Boiler getInstance() {
        if (instance == null){
            instance = new WhiteChocolateBoilerImp();
        }
        return instance;
    }
}
