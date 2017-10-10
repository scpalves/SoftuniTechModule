import java.util.Scanner;
public class P15_NeighbourWars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int PeshosDamage = Integer.parseInt(console.nextLine());
        int GoshosDamage = Integer.parseInt(console.nextLine());
        int PeshosHealth = 100;
        int GoshosHealth = 100;
        int turn = 1;

        while(PeshosHealth >= 1 && GoshosHealth >= 1) {
            if(turn % 2 == 1) {
                GoshosHealth -= PeshosDamage;
                if(GoshosHealth < 1) {
                    System.out.format("Pesho won in %dth round.%n", turn);
                    return;
                }
                System.out.format("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", GoshosHealth);
                if(turn % 3 == 0) {
                    PeshosHealth += 10;
                    GoshosHealth += 10;
                }
                turn++;
            } else {
                PeshosHealth -= GoshosDamage;
                if(PeshosHealth < 1) {
                    System.out.format("Gosho won in %dth round.%n", turn);
                    return;
                }
                System.out.format("Gosho used Thunderous fist and reduced Pesho to %d health.%n", PeshosHealth);
                if(turn % 3 == 0){
                    PeshosHealth += 10;
                    GoshosHealth += 10;
                }
                turn++;
            }
        }
    }
}