import java.util.Scanner;
public class P11_5DifferentNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        if(a + 4 >= b) {
            System.out.println("No");
        } else {
            for(int n1 = a; n1 <= b; n1++) {
                for(int n2 = a; n2 <= b; n2++) {
                    for(int n3 = a; n3 <= b; n3++) {
                        for(int n4 = a; n4 <= b; n4++) {
                            for(int n5 = a; n5 <= b; n5++) {
                                boolean c1 = (a <= n1);
                                boolean c2 = (n1 < n2);
                                boolean c3 = (n2 < n3);
                                boolean c4 = (n3 < n4);
                                boolean c5 = (n4 < n5);
                                boolean c6 = (n5 <= b);

                                if(c1 && c2 && c3 && c4 && c5 && c6) {
                                    System.out.format("%d %d %d %d %d %n", n1, n2, n3 ,n4, n5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
