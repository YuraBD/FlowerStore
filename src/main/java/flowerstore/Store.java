package flowerstore;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public boolean search(Flower flower) {
        for (FlowerBucket flowerBucket : flowerBuckets) {
            for (FlowerPack flowerPack : flowerBucket.flowerPacks) {
                if (flowerPack.getFlower().equals(flower)) {
                    System.out.println(flowerPack);
                    return true;
                }
            }
        }
        return false;
    }
}
