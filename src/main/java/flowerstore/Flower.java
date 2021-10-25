package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Setter @Getter @ToString
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType  flowerType;

    public Flower() {
    }

    public Flower(FlowerType flowerType, int[] color, double price) {
        this.flowerType = flowerType;
        this.setColor(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Flower)) {
            return false;
        }
        Flower flower = (Flower) o;
        return this.flowerType.equals(flower.flowerType)
                && Arrays.equals(this.color, flower.color)
                && this.price == flower.price;
    }
}
