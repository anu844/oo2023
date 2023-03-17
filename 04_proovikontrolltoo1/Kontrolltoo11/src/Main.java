import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static List<Character> tahtedeSagedus(String fileName) throws IOException {
        List<Character> loputahed = new ArrayList<>();
        Map<Character, Integer> tahtede_luger = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (!word.isEmpty()) {
                        char viimane_taht = word.charAt(word.length() - 1);
                        loputahed.add(viimane_taht);
                        tahtede_luger.put(viimane_taht, tahtede_luger.getOrDefault(viimane_taht, 0) + 1);
                    }
                }
            }
        }
        System.out.println("Sõnade viimased tähed: " + loputahed);
        loputahed.sort(Comparator.comparingInt(c -> -tahtede_luger.get(c)));
        return loputahed;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "Tekst2.txt";
        List<Character> sageduses_loputahed = tahtedeSagedus(fileName);
        System.out.println("Tähed esinemissageduse järjekorras: " + sageduses_loputahed);

    }
}