/**
 * Created by Evgeniy on 10.03.2016.
 */
public class Dish {

    private String name;
    private int weigth;
    private int price;

    public Dish(String name, int weigth, int price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getPrice() {
        return price;
    }
}
