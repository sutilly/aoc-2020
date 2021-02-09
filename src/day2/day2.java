package day2;

import java.io.*;
import java.util.ArrayList;


public class day2 {

    public static void main(String[] args) {

        System.out.println("**** Advent of Code Day 2 ****\n");

        ArrayList<String> input = getInput();

        int partOne = findValidPasswordsOne(input);
        System.out.println("valid passwords: " + partOne);

        int partTwo = findValidPasswordsTwo(input);
        System.out.println("valid passwords two: " + partTwo);

}

    public static ArrayList<String> getInput() {

        ArrayList<String> input = new ArrayList<>();

        try {
            File file = new File("assets/day2");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                input.add(st);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    // puzzle 1

    public static int findValidPasswordsOne(ArrayList<String> input) {
        ArrayList<String> validPasswords = new ArrayList<>();

        for (String i : input) {
            String[] splitArray = i.split("[- :/]");
            int min = Integer.parseInt(splitArray[0]);
            int max = Integer.parseInt(splitArray[1]);
            String letter = splitArray[2];
            String pw = splitArray[4];

            int count = pw.length() - pw.replaceAll(letter, "").length();

            if ((count >= min) && (count <= max)) {
                validPasswords.add(pw);
            }
            }
        return validPasswords.size();
        }

    // puzzle 2

    public static int findValidPasswordsTwo(ArrayList<String> input) {
        ArrayList<String> validPasswordsTwo = new ArrayList<>();

        for (String i : input) {
            String[] splitArray = i.split("[- :/]");
            int pos1 = Integer.parseInt(splitArray[0]);
            int pos2 = Integer.parseInt(splitArray[1]);
            String letter = splitArray[2];
            String pw = splitArray[4];

            String letterPos1 = String.valueOf(pw.charAt(pos1 - 1));
            String letterPos2 = String.valueOf(pw.charAt(pos2 - 1));

            if ((letterPos1.equals(letter)) ^ (letterPos2.equals(letter))){
                validPasswordsTwo.add(pw);
            }
        }
        return validPasswordsTwo.size();
    }
    }

