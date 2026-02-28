import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Seatwork11Task06 {

    public static void main(String[] args) {

        // BUILT-IN WORD LIST
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("computer");
        words.add("java");
        words.add("programming");
        words.add("school");
        words.add("hangman");
        words.add("science");
        words.add("education");
        words.add("planet");

        // RANDOM WORD
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        HashSet<Character> guessedLetters = new HashSet<>();

        int wrongGuesses = 0;
        boolean gameWon = false;

        // INITIAL WORD STATE
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("Welcome to Java Hangman!");
        System.out.println("*********************");

        // GAME LOOP
        while (wrongGuesses < 6 && !gameWon) {

            System.out.println(getHangmanArt(wrongGuesses));

            // Show current word state
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Show guessed letters
            System.out.println("Guessed letters: " + guessedLetters);

            // INPUT
            System.out.print("Guess a letter: ");
            String input = scanner.next().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single valid letter.");
                continue;
            }

            char guess = input.charAt(0);

            // Check if already guessed
            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter!");
                continue;
            }

            guessedLetters.add(guess);

            // CHECK GUESS
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    gameWon = true;
                }

            } else {
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
        }

        // FINAL RESULT
        System.out.println(getHangmanArt(wrongGuesses));

        if (gameWon) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("GAME OVER!");
        }

        System.out.println("The word was: " + word);

        scanner.close();
    }

    // HANGMAN ART
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                    
                    
                """;
            case 1 -> """
                  O
                  
                  
                  
                  
                """;
            case 2 -> """
                  O
                  |
                  
                  
                  
                """;
            case 3 -> """
                  O
                 /|
                  
                  
                  
                """;
            case 4 -> """
                  O
                 /|\\
                  
                  
                  
                """;
            case 5 -> """
                  O
                 /|\\
                 /
                  
                  
                """;
            case 6 -> """
                  O
                 /|\\
                 / \\
                  
                  
                """;
            default -> "";
        };
    }
}