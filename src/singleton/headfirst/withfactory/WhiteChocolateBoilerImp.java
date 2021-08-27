package singleton.headfirst.withfactory;

import singleton.headfirst.Boiler;

class WhiteChocolateBoilerImp implements Boiler {
    private boolean empty;
    private boolean boiled;

    // protected access means this can only be instantiated by the factory!
    protected WhiteChocolateBoilerImp() {
        empty = true;
        boiled = false;
    }

    @Override
    public void fill() {

    }

    @Override
    public void boil() {

    }
}
