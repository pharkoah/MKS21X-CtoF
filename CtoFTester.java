import java.util.Scanner;
public class CtoFTester{
      public static void main(String[] args){
        double celcius;
        double farenheit;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the degrees in Celcius: ");
        celcius = in.nextInt();
        in.nextLine();
        System.out.println(farenheit(celcius));
        System.out.print("Input the degrees in Farenheit: ");
        farenheit = in.nextInt();
        in.nextLine();
        System.out.println(celcius(farenheit));
      }
      public static double celcius(double farenheit){
        double celcius = (farenheit - 32) * 5/9 ;
        return celcius;
      }
      public static double farenheit(double celcius){
        double farenheit = (celcius * 9/5) + 32 ;
        return farenheit;
      }
}
