package flowerstore;

import lombok.Getter;
import lombok.ToString;

@ToString @Getter
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public FlowerPack() {
    }

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public int addFlower(Flower flower) {
        if (this.flower != null) {
            if (flower.equals(this.flower)) {
                this.amount++;
            } else {
                return -1;
            }
        } else {
            this.flower = flower;
            this.amount = 1;
        }
        return 0;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    @Override
    public String getDescription() {
        return "FlowerPack{" +
                "flower=" + flower +
                ", amount=" + amount +
                ", totalFlowersPrice=" + getPrice() +
                '}';
    }
}
