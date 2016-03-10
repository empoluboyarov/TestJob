/**
 * Created by Evgeniy on 10.03.2016.
 */
public class Test {

    public static void main(String[] args) {

        // создали клиентов и список их заказов
        Client client = new Client("Пупкин А.");
        Dish[] dishs = {
                new Dish("Салат Изюминка",100,35),
                new Dish("Печень по королевски",150,54),
                new Dish("Рис отварной с маслом",170,16),
                new Dish("Рулет с изюмом",75,15)
        };
        Client client1 = new Client("Кривенко С.");
        Dish[] dishs1 = {
                new Dish("Салат Лукошко",100,40),
                new Dish("Суп куриный с грибами",250,34),
                new Dish("Свинина запеченная\"По-гусарски\"",80,68),
                new Dish("Макароны отварные",170,15),
                new Dish("Пирог с яблоками",75,15)
        };
        Client client2 = new Client("Гайченков П.");
        Dish[] dishs2 = {
                new Dish("Суп болгарский вегетарианский",250,21),
                new Dish("Рыбное филе с помидоркой",80,54),
                new Dish("Пирог с повидлом",60,13),
                new Dish("Рулет с изюмом",75,15)
        };
        Client client3 = new Client("Сухожилов Л.");
        Dish[] dishs3 = {
                new Dish("Салат Изюминка",100,35),
                new Dish("Суп куриный с грибами",250,34),
                new Dish("Пирог с повидлом",60,13),
                new Dish("Макароны отварные",170,15),
                new Dish("Печень по королевски",150,54)

        };
        System.out.println("Первый отчет для столовой:"+'\n');
        new Report1(dishs, dishs1,dishs2,dishs3);

        System.out.println('\n'+"Второй отчет для раздачи:");
        new Report2(client, dishs);
        new Report2(client1,dishs1);
        new Report2(client2,dishs2);
        new Report2(client3,dishs3);


    }
}
