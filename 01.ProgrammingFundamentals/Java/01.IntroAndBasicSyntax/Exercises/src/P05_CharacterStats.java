import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P05_CharacterStats {
    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String name = console.readLine();
        int currentHealth = Integer.parseInt(console.readLine());
        int maximumHealth = Integer.parseInt(console.readLine());
        int currentEnergy = Integer.parseInt(console.readLine());
        int maximumEnergy = Integer.parseInt(console.readLine());

        System.out.format("Name: %s" + System.lineSeparator() +
                          "Health: |%s|" + System.lineSeparator() +
                          "Energy: |%s|",
                          name,
                          Health(currentHealth,maximumHealth),
                          Health(currentEnergy, maximumEnergy));
    }
    private static String Health(int current, int max) {
        String rem = "";
        for(int i = 1; i <= current; i++) {
            rem += "|";
        }
        for(int j = 1; j <= max - current; j++) {
            rem += ".";
        }
        return rem;
    }
}
