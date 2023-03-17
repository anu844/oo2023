import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputFileName = "Tekst.txt";
        String outputFileName = "Output5.txt";

            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            FileWriter writer = new FileWriter(outputFileName);
            String line;
            while ((line = reader.readLine()) !=null){
                String ilmaMarkideta = line.replaceAll("[^a-zA-Z0-9\\s+]", "");
                writer.write(ilmaMarkideta + "\n");
            }
            reader.close();
            writer.close();

        System.out.println("Kontrolltoo!");
        BufferedReader br = new BufferedReader(new FileReader("Tekst.txt"));
        String rida = br.readLine();
        //System.out.println(rida);
        //* Trüki välja sõnade viimased tähed

        while (rida != null) {
            String[] tykeldus = rida.split(" ");
            //System.out.println(Arrays.toString(tykeldus));
            for (int i = 0; i < tykeldus.length; i++) {
                String s = tykeldus[i];
                System.out.println(s);
                //System.out.println(s.length());
                //System.out.println(s.length()-1);
                //System.out.println(s.charAt(s.length()-1));
                System.out.println("---");

                char lastChar = s.charAt(s.length() - 1);
                ArrayList<Character> letterOrDigitList = new ArrayList<>();
                for (int k = 0; k < s.length(); k++) {
                    char lastchar = s.charAt(i);
                    if (Character.isLetterOrDigit(lastChar)) {
                        letterOrDigitList.add(lastChar);
                        System.out.println(lastChar);
                        System.out.println(letterOrDigitList);
                }
                    System.out.println(letterOrDigitList);
            }
            }
            rida = br.readLine();
        }

    }

}