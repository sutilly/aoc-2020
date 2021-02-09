package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class day1 {

    public static void main(String[] args) {

        System.out.println("**** Advent of Code Day 1 ****\n");

        ArrayList<Integer> expenses = getExpenses();
        int result1 = findTwoNumbers(expenses);
        int result2 = findThreeNumbers(expenses);

        System.out.println("two numbers: " + result1);
        System.out.println("three numbers: " + result2);

}

    public static ArrayList<Integer> getExpenses() {

        ArrayList<Integer> expenses = new ArrayList<>();

        try {
            File file = new File("assets/day1");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                expenses.add(Integer.parseInt(st));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    // puzzle 1
    public static int findTwoNumbers(ArrayList<Integer> expenses) {
        int res = 0;

        for (Integer i : expenses) {
            for (Integer j : expenses) {
                        if (i + j == 2020) {
                            res = i * j ;
                        }
                }
        }
        return res;
    }

    // puzzle 2
    public static int findThreeNumbers(ArrayList<Integer> expenses) {
        int res = 0;

        for (Integer i : expenses) {
            for (Integer j : expenses) {
                for (Integer k: expenses) {
                    if (i + j + k == 2020) {
                        res = i * j * k;
                    }
                }

            }
        }
        return res;
    }
}
