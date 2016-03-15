import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Evgeniy on 15.03.2016.
 */
public class TestParser {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {


        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src/clientbase.xml"));
        NodeList nodeList = document.getElementsByTagName("order");
        for (int i= 0; i<nodeList.getLength(); i++){
            Element element = (Element)nodeList.item(i);

            String clientName = element.getAttribute("clientName");
            System.out.println(clientName);

            NodeList nodeList1 = element.getElementsByTagName("name");

            for (int n = 0; n < nodeList1.getLength();n++){
                String foodName;
                Element element1 = (Element)nodeList1.item(n);
                foodName = element1.getChildNodes().item(0).getNodeValue();
                System.out.println(foodName);
            }
        }
    }
}
