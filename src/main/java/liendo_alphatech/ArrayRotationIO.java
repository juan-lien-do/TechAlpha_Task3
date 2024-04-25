package liendo_alphatech;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationIO implements ArrayRotationIOInterface {
    private Scanner sc;
    private ArrayRotationController arc;

    public ArrayRotationIO(ArrayRotationController arc) {
        this.sc = new Scanner(System.in);
        this.arc = arc;
    }

    public void askForInitialArray() {
        System.out.println("Hello, welcome to the RotateArrayApp.\nHow many items are in your array?");
        int arrayLength = askArrayLength();
        System.out.println("What is the value of D?");
        int dFactor = askDFactor(arrayLength);
        Long[] array = new Long[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("What is the " + (i + 1) + "th number?");
            array[i] = askNumber();
        }
        arc.setInitialNumberArray(array);
        arc.setDFactor(dFactor);
    }

    private int askDFactor(int arrayLength){
        int dFactor;
        while (true) {
            try {
                dFactor = sc.nextInt();
                if (dFactor <= 1) throw new Exception();
                return dFactor;
            } catch (Exception e) {
                System.out.println("Wrongly formatted number. \nRemember: This method only accepts positive values below or equal to the previously setted array length.");
                sc.nextLine();
            }
        }
    }

    private int askArrayLength() {
        int len;
        while (true) {
            try {
                len = sc.nextInt();
                if (len <= 1) throw new Exception();
                return len;
            } catch (Exception e) {
                System.out.println("Wrongly formatted number. Remember: This method only accepts values above 1.");
                sc.nextLine();
            }
        }
    }

    private Long askNumber() {
        Long num;
        while (true) {
            try {
                num = sc.nextLong();
                return num;
            } catch (Exception e) {
                System.out.println("Wrongly formatted number. Try again.");
                sc.nextLine();
            }
        }
    }

    public void showArray(Long[] finalNumberArray) {
        System.out.println(Arrays.toString(finalNumberArray));
    }
}