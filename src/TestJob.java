import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Evgeniy on 15.03.2016.
 */
public class TestJob {

    public static void main(String[] args)  {


        Order order1 = new Order("Пупкин.А");
        Order order2 = new Order("Кривенко С.");
        Order order3 = new Order("Гайченков П.");
        Order order4 = new Order("Сухожилов Л.");
        // формируем отчеты для раздачи
        System.out.println("Печатаем отчетs для раздачи:");
        MegaReport report1 = new MegaReport(order1);
        MegaReport report2 = new MegaReport(order2);
        MegaReport report3 = new MegaReport(order3);
        MegaReport report4 = new MegaReport(order4);
        // формируем отчет для кухни

        report1.printReport1();

    }
}
