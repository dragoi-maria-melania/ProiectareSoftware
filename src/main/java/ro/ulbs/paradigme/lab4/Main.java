package ro.ulbs.paradigme.lab4;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        Random rand = new Random();

        // a) Adăugăm câțiva studenți
        studenti.add(new Student("Popescu Ion", "A1"));
        studenti.add(new Student("Ionescu Maria", "B2"));
        studenti.add(new Student("Georgescu Vlad", "A1"));
        studenti.add(new Student("Dumitru Ana", "B2"));
        studenti.add(new Student("Stan Andrei", "C3"));

        // a) Generăm note aleatorii
        for (Student s : studenti) {
            s.genereazaNote(rand);
        }

        // b1) Afișare ordonată alfabetic pe grupe
        System.out.println("\n--- b1) Ordonare alfabetic pe grupe ---");
        studenti.stream()
                .sorted(Comparator.comparing(Student::getGrupa).thenComparing(Student::getNume))
                .forEach(System.out::println);

        // b2) Integraliști ordonați descrescător după medie
        System.out.println("\n--- b2) Integraliști după medie descrescător ---");
        studenti.stream()
                .filter(Student::isIntegralist)
                .sorted(Comparator.comparing(Student::medie).reversed())
                .forEach(System.out::println);

        // b3) Restanțieri ordonați crescător după nr. de restanțe
        System.out.println("\n--- b3) Restanțieri după nr. de restanțe ---");
        studenti.stream()
                .filter(s -> !s.isIntegralist())
                .sorted(Comparator.comparing(Student::nrRestante))
                .forEach(System.out::println);
    }
}
