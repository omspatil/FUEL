package posttest;
//Write a program on looping concept to design a star pattern of your first letter of your name.

public class one {
    public static void main(String[] args) {
        int size = 7;
        printStarPatternO(size);
    }

    public static void printStarPatternO(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size - 1) && (j > 0 && j < size - 1)) {
                    System.out.print("*");
                } else if ((j == 0 || j == size - 1) && (i > 0 && i < size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
