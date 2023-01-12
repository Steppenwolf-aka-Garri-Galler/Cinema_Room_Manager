
public class cinemaRoomManager {
    public static void main(String[] args) {
        int counter = 1;
        int[][] matrix = new int[7][8];
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == 0)
                    System.out.print(counter);
                else
                    System.out.print(" S");
            }
            System.out.println();
            counter++;
        }
    }
}

