package com.hillel.pinkovskiy.homeworks.homework6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        if (index == -1) {
            return -1;
        } else {
            return index;
        }
    }

    public static String stringReverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public class GuessTheWord {
        public static void main(String[] args) {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

            Random random = new Random();
            int wordIndex = random.nextInt(words.length);

            String guessedWord = words[wordIndex];
            int wordLength = guessedWord.length();

            System.out.println("Комп'ютер загадав слово. Спробуйте відгадати його.");

            Scanner scanner = new Scanner(System.in);
            String userGuess;

            do {
                System.out.print("Ваша відповідь: ");
                userGuess = scanner.nextLine().toLowerCase();

                if (userGuess.equals(guessedWord)) {
                    System.out.println("Вітаємо, ви відгадали слово!");
                    break;
                }

                for (int i = 0; i < wordLength; i++) {
                    if (i >= userGuess.length()) {
                        System.out.print("#");
                    } else if (userGuess.charAt(i) == guessedWord.charAt(i)) {
                        System.out.print(guessedWord.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            } while (true);
        }
    }
}
