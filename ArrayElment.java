package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class ArrayElment {

    public static void main(String[] args) {
        int [] array = {8,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        array [0] = 45;
        System.out.println(Arrays.toString(array));
        System.out.print(array[0]+" ");
        System.out.print(array[1]+" ");
        System.out.print(array[2]+" ");
        System.out.print(array[3]+" ");
        System.out.print(array[4]+" ");


    }
}
