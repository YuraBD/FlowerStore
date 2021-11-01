import decorators.BasketDecorator;
import decorators.ItemDecorator;
import decorators.RibbonDecorator;
import flowerstore.Item;
import decorators.PaperDecorator;
import flowerstore.*;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100);
        Item item2 = new FlowerPack(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100), 10);
        Item item3 = new FlowerBucket();
        FlowerPack flowerPack1 = new FlowerPack(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100), 7);
        FlowerPack flowerPack2 = new FlowerPack(new Flower(FlowerType.CHAMOMILE, new int[]{255,0,255}, 10), 7);
        ((FlowerBucket)item3).addFlowerPack(flowerPack1);
        ((FlowerBucket)item3).addFlowerPack(flowerPack2);
        System.out.println(item1.getPrice());
        System.out.println(item2.getPrice());
        System.out.println(item3.getPrice());
        Order order = new Order();
        System.out.println(order.calculateTotalPrice());
        order.addItem(item1);
        System.out.println(order.calculateTotalPrice());
        order.addItem(item2);
        System.out.println(order.calculateTotalPrice());
        order.addItem(item3);
        System.out.println(order.calculateTotalPrice());
        order.removeItem(item1);
        System.out.println(order.calculateTotalPrice());
        order.removeItem(item2);
        System.out.println(order.calculateTotalPrice());
        order.removeItem(item3);
        System.out.println(order.calculateTotalPrice());
    }
}