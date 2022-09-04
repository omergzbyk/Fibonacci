import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,first = 0,second = 1,thirth;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayisini girin : ");
        number = scanner.nextInt();
        thirth = first + second;
        System.out.println("Fibonacci Sayilari");
        System.out.print(first+ " "+second+ " ");
        for (int i = 1; i <= number-2 ; i++) {
            first = second;
            second = thirth;
            thirth = first + second;
            System.out.print(thirth+" ");
        }
    }

}
