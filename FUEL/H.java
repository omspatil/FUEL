class star {
    public static void main(String[] args) {
        int size = 5; // Adjust the size of the letter "H" as needed
        printH(size);
    }

    public static void printH(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == size / 2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
