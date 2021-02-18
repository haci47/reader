 import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {

       // Create Scanner object to read from the keyboard.
        Scanner reader = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");

       // NextInt () method is used to read integer type values.
        int n = reader.nextInt();

        int toplam = 0;

        for(int i = 1; i <=n; i++){
            if(i%2!=0){
                toplam += i;
                //System.out.println(i);
            }
        }
        System.out.println("Sum of Odd Numbers = "+ toplam);
    }
}
