package numberplate;

import java.util.Random;

public class NumberPlate {
    
    private char [] letters = {'Y', 'K', 'E', 'H', 'X', 'B', 'A', 'P', 'O', 'C', 'M', 'T'};
    private int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Random rand = new Random();
    String plate;
    int count;
    
    NumberPlate() {
        
    }
    
    private char getLetter() {
        int n = rand.nextInt(letters.length);
        return (char) letters[n];
    }
    
    private int getNumber() {
        int n = rand.nextInt(numbers.length);
        return numbers[n];
    }
    
    private String getPlate() {
        plate = getLetter() + "" + getNumber() + "" + getNumber() + "" + getNumber()
                + "" + getLetter() + "" + getLetter() + "" + getNumber() + "" + getNumber();
        return plate;
    }
    
    private boolean equalsLetters() {
        if (plate.charAt(0) == plate.charAt(4) && plate.charAt(4) == plate.charAt(5)) {
            return true;
        }
        return false;
    }
    
    private boolean equalsNumbers() {
        if (plate.charAt(1) == plate.charAt(2) && plate.charAt(2) == plate.charAt(3)) {
            return true;
        }
        return false;
    }
    
    private String equalsAll() {
        if (equalsLetters() == true && equalsNumbers() == true) {
            return "BINGO!";
        }
        return "";
    }
    
    public static void main(String[] args) {
        NumberPlate mp = new NumberPlate();
        
        do {
            mp.count++;
            System.out.print(mp.count + " | " + mp.getPlate() + " | ");
            System.out.println(mp.equalsLetters() + " | " + mp.equalsNumbers() + " | " + mp.equalsAll());
        } while (mp.equalsAll().equals(""));
    }
    
}
