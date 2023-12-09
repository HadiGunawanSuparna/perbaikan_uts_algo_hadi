import java.util.ArrayList;
import java.util.Scanner;

public class App {

    // Define constants for grade points
    private static final double GRADE_A = 4.00;
    private static final double GRADE_A_MINUS = 3.50;
    private static final double GRADE_B_PLUS = 3.25;
    private static final double GRADE_B = 3.00;
    private static final double GRADE_B_MINUS = 2.75;

    public static void main(String[] args) {
        // ... (unchanged code)

        // Use constants instead of magic numbers
        double multiplier = 1.5;

        // ... (unchanged code)

        for (int i = 0; i < kodeMatkul.size(); i++) {
            if (semester >= (i + 1)) {
                // ... (unchanged code)

                // Use constants instead of magic numbers
                double bobot = sks * multiplier;

                // ... (unchanged code)
            }
        }

        // ... (unchanged code)
    }

    // ... (unchanged code)

    // Use constants instead of magic numbers
    public static double getNilaiBobot(String nilai) {
        double bobot = 0;
        switch (nilai) {
            case "A":
                bobot = GRADE_A;
                break;
            case "A-":
                bobot = GRADE_A_MINUS;
                break;
            case "B+":
                bobot = GRADE_B_PLUS;
                break;
            case "B":
                bobot = GRADE_B;
                break;
            case "B-":
                bobot = GRADE_B_MINUS;
                break;
        }
        return bobot;
    }

    // ... (unchanged code)
}
