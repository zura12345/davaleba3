package shualeduri;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand2 = new Random();
        ArrayList<Integer> rand_range = new ArrayList<Integer>();

        for (int i = 0; i < 12; i++) {
            rand_range.add(rand2.nextInt((10 - 5) + 1) + 5);
        }

        ArrayList<Integer> copy_range = new ArrayList<Integer>(rand_range);

        for (int i = 4; i < rand_range.size(); i+=4) {
            rand_range.add(i, rand2.nextInt((25- 20) + 1) + 20);
        }

        System.out.println("initial: " + copy_range);
        System.out.println("modified: " + rand_range);

    }
}


