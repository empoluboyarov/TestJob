import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Evgeniy on 14.03.2016.
 */
public class MyParser {

    public int setPrice(String name) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src/menubase.xml"));

        NodeList nodeList = (NodeList) document.getElementsByTagName("food");
        int price = 0;


        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);

            String title = element.getElementsByTagName("foodName").item(0).getChildNodes().item(0).getNodeValue();
            price = Integer.parseInt(element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue());
            if (title.equals(name)) {
                break;
            }
        }
        return price;
    }
    public int setWeight(String name) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src/menubase.xml"));

        NodeList nodeList = (NodeList) document.getElementsByTagName("food");
        int weight = 0;


        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);

            String title = element.getElementsByTagName("foodName").item(0).getChildNodes().item(0).getNodeValue();
            weight = Integer.parseInt(element.getElementsByTagName("weight").item(0).getChildNodes().item(0).getNodeValue());
            if (title.equals(name)) {
                break;
            }
        }
        return weight;
    }


    public ArrayList<Dish> creator(String name) throws ParserConfigurationException, IOException, SAXException {
        ArrayList<Dish> dishArrayList = new ArrayList<Dish>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src/clientbase.xml"));
        NodeList nodeList = document.getElementsByTagName("order");

        for (int i= 0; i<nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);

            String clientName = element.getAttribute("clientName");
            if(clientName.equals(name)) {
                NodeList nodeList1 = element.getElementsByTagName("name");
                for (int n = 0; n < nodeList1.getLength();n++){
                    String foodName;
                    Element element1 = (Element)nodeList1.item(n);
                    foodName = element1.getChildNodes().item(0).getNodeValue();
                    Dish dish = new Dish(foodName);
                    dishArrayList.add(dish);

                }
            }
        }
        return dishArrayList;
    }
}

