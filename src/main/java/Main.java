import flowerstore.*;

public class Main {
    public static void main(String[] args) {
        FlowerPack flowerPack1 = new FlowerPack();
        FlowerPack flowerPack2 = new FlowerPack();
        int[] color = {127, 0, 0};
        double price = 100;
        for (int i = 0; i < 3; i++) {
            flowerPack1.addFlower(new Flower(FlowerType.ROSE, color, price));
        }
        for (int i = 0; i < 3; i++) {
            flowerPack2.addFlower(new Flower(FlowerType.CHAMOMILE, color, price));
        }

        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack1);
        flowerBucket.addFlowerPack(flowerPack2);

        Flower flower1 = new Flower(FlowerType.CHAMOMILE, new int[]{255,0,0}, 100);
        Flower flower2 = new Flower(FlowerType.ROSE, color, price);
        System.out.println(flower1);

        Store store = new Store();
        store.addFlowerBucket(flowerBucket);
        System.out.println(store);
        System.out.println(store.search(new Flower(FlowerType.ROSE, color, price)));
    }
}