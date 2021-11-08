package user;

import lombok.Getter;

@Getter
public class Sender extends User {
    private int id;
    public Sender() {
        this.id = User.id++;
    }

    public void update(boolean context) {
        if (context) {
            System.out.println("Sender update");
        }
    }
}
