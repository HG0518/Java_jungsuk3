public class Exercise07_17 {
}

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){}
}

class Marine extends Unit{
    void stimPack(){}
    void move(int x, int y){}
}

class Tank extends Unit{
    void changeMode(){}
    void move(int x, int y){}
}

class Dropship extends Unit{
    void load(){}
    void unload(){}
    void move(int x, int y){}
}

