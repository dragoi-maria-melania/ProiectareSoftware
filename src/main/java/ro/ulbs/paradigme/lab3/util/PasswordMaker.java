package ro.ulbs.paradigme.lab3.util;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 7;  // Constanta pentru numărul magic
    private final String magicString;  // Câmp pentru magicString
    private String name;  // Câmp pentru stocarea numelui

    // Constructorul clasei
    public PasswordMaker(String name) {
        this.name = name;  // Stocăm numele primit
        this.magicString = generateRandomString(20);  // Generăm magicString
    }

    // Metoda care generează un String aleatoriu de o anumită lungime
    private String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";  // Setul de caractere
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());  // Selectăm aleatoriu un caracter
            sb.append(characters.charAt(index));  // Adăugăm caracterul la șir
        }
        return sb.toString();  // Returnăm șirul generat
    }

    // Metoda care generează parola
    public String getPassword() {
        String randomPart = StringRandomizer.getRandomString(MAGIC_NUMBER);  // Un șir aleatoriu de lungime MAGIC_NUMBER
        String magicSubstring = magicString.substring(0, 10);  // 10 caractere din magicString
        String nameLength = String.valueOf(name.length());  // Lungimea numelui
        int randomNumber = (int) (Math.random() * 51);  // Un număr aleator între 0 și 50

        return randomPart + magicSubstring + nameLength + randomNumber;  // Construim parola
    }

}
