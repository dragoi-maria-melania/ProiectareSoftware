package ro.ulbs.paradigme.lab3.util;

public class StringRandomizer {
    // Metoda statică pentru a genera un String aleatoriu de o lungime dată
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";  // Setul de caractere
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());  // Selectăm aleatoriu un caracter
            sb.append(characters.charAt(index));  // Adăugăm caracterul la șir
        }
        return sb.toString();  // Returnăm șirul generat
    }
}
