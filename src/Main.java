import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
         Object o = new Scanner(System.in);




        // System.out.println(o instanceof Scanner);

        Scanner scanner = null;
        if (o instanceof Scanner) scanner  = (Scanner) o;

         if (scanner != null){
             scanner.nextInt();
         }

         Object o1 = new String();


    }


}