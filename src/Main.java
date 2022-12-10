import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

       /*
        Object o = new Scanner(System.in);




        // System.out.println(o instanceof Scanner);

        Scanner scanner = null;
        if (o instanceof Scanner) scanner  = (Scanner) o;

         if (scanner != null){
             scanner.nextInt();
         }

         Object o1 = new String();

*/

        Object[] objects = {10, "Привет", 3.14}; // Здесь происходит автоупаковка

        for (Object o : objects) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s);
            }


        }

        ArrayList<Integer> numbers = new ArrayList(); //сохраняет Object

        for (int i = 0; i < 10; i++) { // сохраняет в коллекцию числа 10, 20 ... 100
            numbers.add(i * 10);
            // numbers.add(i*10.4f);

        }

        //numbers.add(10.4f);

        int sum = 0;
        for (Integer o : numbers) {
            sum = sum + /*(Integer)*/ o;

        }
        System.out.println(sum);

        // ОсновнойТип <ТипПараметр>
        // ОсновнойТип <ТипПараметр1, ТипПараметр2,ТипПараметр3,ТипПараметр4>

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(7, "Privet");
        map.put(15, "Hello");

        ArrayList<String> listHello = new ArrayList<>();
        listHello.add("Privet");
        listHello.add("Hi");


        ArrayList<String> listBye = new ArrayList<>();
        listBye.add("Poka");
        listBye.add("Good Bye");

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(listHello);
        list.add(listBye);

        for (ArrayList<String> spisok : list){
            for (String s : spisok){
                System.out.println(s);
            }
        }


    }


}


/*
 *     то что делаем мы в коде                                     то во что преобразует компилятор
 *   ArrayList<Integer> list = new ArreyList<Integer>();        ArrayList list = new ArrayList
 *   list.add(1);                                               list.add((Integer) 1);
 *   int x = list.get(0);                                       int x = (Integer) list.get(0);
 *    list.set(0, 10);                                          list.set(0, (Integer) 10);
 *
 */


