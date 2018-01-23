import java.util.Scanner;

public class Names {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        System.out.println("Podaj 5 imion: ");
        names[0] = sc.nextLine();
        names[1] = sc.nextLine();
        names[2] = sc.nextLine();
        names[3] = sc.nextLine();
        names[4] = sc.nextLine();

        for(int n = 4 ; n >= 0 ; n--){
            System.out.println("Cześć " + names[n]);
        }
    }
}
