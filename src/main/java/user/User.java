package user;

public abstract class User {
    static int id = 1;
    public abstract void update(boolean context);
    public abstract int getId();
}
