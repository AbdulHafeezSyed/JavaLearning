package com.psoft.arrays;
public class Demo {
    public static void main(String[] args) {
        int[][] a = new int[2][5]; // 2 classrooms, 5 students each

        // Manually assign ages
        a[0][0] = 10;
        a[0][1] = 11;
        a[0][2] = 12;
        a[0][3] = 13;
        a[0][4] = 14;

        a[1][0] = 15;
        a[1][1] = 16;
        a[1][2] = 17;
        a[1][3] = 18;
        a[1][4] = 19;

        // Print the ages with their classroom and student index
        System.out.println("The ages are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Classroom " + i + ", Student " + j + " Age: " + a[i][j]);
            }
        }
    }
}
