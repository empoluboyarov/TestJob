import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Evgeniy on 10.03.2016.
 */
public class Dish{

    private String name;
    private int weight;
    private int price;

    public Dish(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Dish(String name)  {
        MyParser myParser = new MyParser();
        this.name = name;
        try {
            this.weight = myParser.setWeight(name);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        try {
            this.price = myParser.setPrice(name);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }
}
