import java.util.ArrayList;

/**
 * Created by Evgeniy on 10.03.2016.
 */
public class Report {
    private static int count2 = 0;
    private static int count = 0;
    private static ArrayList<Dish> myList = new ArrayList<Dish>();

    protected void setMyList (Dish[] dishs){
        for (int i=0; i<dishs.length; i++){
            myList.add(dishs[i]);
        }
    }

    protected void printReport1(){
        for (int i = 0; i<myList.size(); i++){

            Dish dish = (Dish)myList.get(i);

            String name1 = dish.getName();
            int price = dish.getPrice();
            int weight = 1; // в случае если нужен вес то поставить - dish.getWeigth();

            for (int m=i+1; m<myList.size(); m++){
                Dish dish2 = (Dish)myList.get(m);
                if(name1.equals(dish2.getName())){
                    weight = weight+1;//в случае если нужен вес то поставить - dish2.getWeigth();
                    price = price+dish2.getPrice();
                    myList.remove(m);
                }
            }

            System.out.println(name1+" - "+ weight+" порции(я)"+ " - "+price+" р." );// если нужен вес - то порции меняем на граммы
            count = count+price;
        }
        System.out.println('\n'+"Итоговая стоимость заказа составляет "+count+" р.");
    }

    protected void printReport2(Client client, Dish[] dishs){
        count2 = 0;
        for (int i = 0; i<dishs.length; i++){
            count2 = dishs[i].getPrice()+count2;
            System.out.print( '\n'+client.getClientName()+" - "+dishs[i].getName());
        }
        System.out.print(" - Итоговая стоимость заказа - "+count2+" р.");
    }
}
