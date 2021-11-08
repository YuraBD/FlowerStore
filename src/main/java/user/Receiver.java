package user;

import lombok.Getter;

@Getter
public class Receiver extends User{
    private int id;
    public Receiver() {
        this.id = User.id++;
    }

    public void update(boolean context) {
        if (context) {
            System.out.println("Receiver update");
        }
    }
}
