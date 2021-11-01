package flowerstore;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends  Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

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

    @Override
    public String getDescription() {
        return "FlowerBucket{" +
                "flowerPacks=" + flowerPacks +
                ", totalPacksPrice =" + getPrice() +
                '}';
    }
}
