import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, u, ttl=1;

        System.out.print("Ussu alinacak sayi: ");
        n = inp.nextInt();

        System.out.print("Us olacak sayi: ");
        u = inp.nextInt();

        for (int i = 1; i <= u; i++){
                ttl *= n;
        }
        System.out.println(ttl);

    }

}





