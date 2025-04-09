package ro.ulbs.paradigme.lab4;

import java.util.*;

public class Student {
    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String grupa) {
        this.nume = nume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public void genereazaNote(Random rand) {
        for (int i = 0; i < 5; i++) {
            note.add(4 + rand.nextInt(7)); // 4..10
        }
    }

    public double medie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public int nrRestante() {
        int count = 0;
        for (int nota : note) {
            if (nota < 5) {
                count++;
            }
        }
        return count;
    }

    public boolean isIntegralist() {
        return nrRestante() == 0;
    }

    @Override
    public String toString() {
        return String.format("%s [%s] Note: %s | Medie: %.2f | Restante: %d",
                nume, grupa, note, medie(), nrRestante());
    }

    public String getGrupa() {
        return grupa;
    }

    public String getNume() {
        return nume;
    }
}
