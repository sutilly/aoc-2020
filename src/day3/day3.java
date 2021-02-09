package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class day3 {

    public static void main(String[] args) {

        System.out.println("**** Advent of Code Day 3 ****\n");

        ArrayList<String> input = getInput();
        for (String line: input) {
            System.out.println(line);
        }

        long rightOneDownOne = findTreesRight1DownOne(input);
        long rightThreeDownOne = findTreesRight3DownOne(input);
        long rightFivedownOne = findTreesRight5DownOne(input);
        long rightSevenDownOne = findTreesRight7DownOne(input);
        long rightOnedownTwo = findTreesRight1Down2(input);

        long result = rightOneDownOne * rightThreeDownOne *rightFivedownOne*rightSevenDownOne*rightOnedownTwo;
        System.out.println(result);

    }

    public static ArrayList<String> getInput() {

        ArrayList<String> input = new ArrayList<>();

        try {
            File file = new File("assets/day3");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            String repeated = "";
            while ((st = br.readLine()) != null) {
                repeated = st.repeat(500);
                input.add(repeated);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    // puzzle 1

    public static long findTreesRight3DownOne(ArrayList<String> input) {
        int x = 0;
        long trees = 0;

        for (String line : input) {
            String stringAtX = String.valueOf(line.charAt(x));
            if (stringAtX.equals("#")) {
                trees ++; }
            x += 3;
        }

        return trees;
        }

    // puzzle 2

    public static long findTreesRight1DownOne(ArrayList<String> input) {
        int x = 0;
        long trees = 0;

        for (String line : input) {
            String stringAtX = String.valueOf(line.charAt(x));
            if (stringAtX.equals("#")) {
                trees ++; }
            x ++;
        }

        return trees;
    }

    public static long findTreesRight5DownOne(ArrayList<String> input) {
        int x = 0;
        long trees = 0;

        for (String line : input) {
            String stringAtX = String.valueOf(line.charAt(x));
            if (stringAtX.equals("#")) {
                trees ++; }
            x += 5;
        }

        return trees;
    }

    public static long findTreesRight7DownOne(ArrayList<String> input) {
        int x = 0;
        long trees = 0;

        for (String line : input) {
            String stringAtX = String.valueOf(line.charAt(x));
            if (stringAtX.equals("#")) {
                trees ++; }
            x += 7;
        }

        return trees;
    }

    public static long findTreesRight1Down2(ArrayList<String> input) {
        int x = 0;
        long trees = 0;

        for(int i = 0; i<input.size(); i+=2) {
            String stringAtX = String.valueOf(input.get(i).charAt(x));
            if (stringAtX.equals("#")) {
                trees ++; }
            x ++;
        }

        return trees;
    }



    }
