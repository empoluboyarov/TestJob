import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Evgeniy on 15.03.2016.
 */
public class Order {

    private String nameClient;
    private ArrayList<Dish> dishs;

    public Order(String nameClient) {
        this.nameClient = nameClient;
        MyParser parser = new MyParser();
        try {
            dishs = parser.creator(nameClient);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public String getNameClient() {
        return nameClient;
    }

    public ArrayList<Dish> getDishs() {
        return dishs;
    }
}
