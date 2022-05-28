import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int n, k;
        int pow = 1;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Bir Sayı Giriniz: ");
        n = sc.nextInt();

        System.out.print("Sayının Kuvvetini Giriniz: ");
        k = sc.nextInt();

        // RESULT
        for(int i=1; i<=k; i++){
            pow *= n;
        }

        System.out.println("Üslü İfadenin Sonucu: " + pow);

    }
}
