package flowerstore;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public FlowerBucket() {
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (FlowerPack flowerpack : flowerPacks) {
            totalPrice += flowerpack.getPrice();
        }
        return totalPrice;
    }

}
