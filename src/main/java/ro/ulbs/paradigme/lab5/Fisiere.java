package ro.ulbs.paradigme.lab5;

import java.io.*;
import java.util.*;

public class Fisiere {

    public static void main(String[] args) {
        try {
            // === 5.3.1 ===
            BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
            StringBuilder resultA = new StringBuilder();
            StringBuilder resultB = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                // a) Adaugăm newline la sfârșitul fiecărei linii
                resultA.append(line).append("\n");

                // b) Adăugăm newline după fiecare punct (.)
                for (char c : line.toCharArray()) {
                    resultB.append(c);
                    if (c == '.') {
                        resultB.append("\n");
                    }
                }
                resultB.append("\n"); // separare între linii
            }
            reader.close();

            // Afișăm rezultatele
            System.out.println("=== Rezultatul A ===\n" + resultA);
            System.out.println("=== Rezultatul B ===\n" + resultB);

            // c) Scriem în out.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            writer.write("=== Rezultat A ===\n");
            writer.write(resultA.toString());
            writer.write("\n=== Rezultat B ===\n");
            writer.write(resultB.toString());
            writer.close();

            // === 5.3.2 ===
            BufferedWriter randWriter = new BufferedWriter(new FileWriter("outrand.txt"));
            Random random = new Random();

            for (int i = 0; i < 5; i++) {
                List<String> words = new ArrayList<>();
                for (int j = 0; j < 10; j++) {
                    StringBuilder word = new StringBuilder();
                    for (int k = 0; k < 4; k++) {
                        word.append((char) ('a' + random.nextInt(26)));
                    }
                    words.add(word.toString());
                }
                Collections.sort(words);
                randWriter.write(String.join(" ", words));
                randWriter.newLine();
            }
            randWriter.close();

            System.out.println("Fisierele out.txt și outrand.txt au fost create cu succes!");

        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
