import java.util.ArrayList;

/**
 * Created by Evgeniy on 15.03.2016.
 */
public class MegaReport {
    private String nameClient;
    private ArrayList<Dish> dishs;

    private static int count2 = 0;
    private static int count = 0;

    private static ArrayList<Dish> myList = new ArrayList<Dish>();

    public MegaReport(Order order) {
        this.nameClient = order.getNameClient();
        this.dishs = order.getDishs();
        setMyList(order.getDishs());
        printReport2();
    }

    private void setMyList(ArrayList<Dish> dishs) {
        for (int i = 0; i < dishs.size(); i++) {
            Dish dish = (Dish) dishs.get(i);
            myList.add(dish);
        }
    }

    protected void printReport1() {
        System.out.println(""+ '\n');
        System.out.println("Печать отчета для столовой." + '\n');

        for (int n = 0; n < myList.size(); n++) {
            Dish dish = (Dish) myList.get(n);

            String name1 = dish.getName();
            int price = dish.getPrice();
            int weight = 1; // в случае если нужен вес то поставить - dish.getWeight();

            for (int m = n + 1; m < myList.size(); m++) {
                Dish dish2 = (Dish) myList.get(m);
                if (name1.equals(dish2.getName())) {
                    weight = weight + 1;//в случае если нужен вес то поставить - dish2.getWeight();
                    price = price + dish2.getPrice();
                    myList.remove(m);
                    }
            }
            System.out.println(name1+" - "+ weight+" порции(я)"+ " - "+price+" р." );// если нужен вес - то порции меняем на граммы
            count = count+price;
            }
        System.out.println('\n'+"Итоговая стоимость заказа составляет "+count+" р.");
        }

    protected void printReport2(){
        count2 =0;
        for (int m=0; m < dishs.size(); m++){
            Dish dish = (Dish)dishs.get(m);
            count2 = dish.getPrice()+count2;
            System.out.print( '\n' + nameClient + " - "+dish.getName());
        }
        System.out.print(" - Итоговая стоимость заказа - "+count2+" р.");
        }
}

