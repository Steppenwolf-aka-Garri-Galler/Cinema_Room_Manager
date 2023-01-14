import java.util.Scanner;
public class cinemaRoomManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();
        int income;

        if (rows * seats < 60) {
            income = rows * seats * 10;
        } else {
            if(rows % 2 == 0) {
                int frontRows = rows / 2;
                int backRows = rows / 2;
                income = (frontRows * 10 * seats) + (backRows * 8 * seats);
            } else {
                int frontRows = ((rows - 1) / 2) * 10;
                int backRows = ((rows + 1) / 2) * 8;
                income = (frontRows * seats) + (backRows * seats);
            }
        }
        System.out.println("Total income:$" + income);




        /*
        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == 0)
                    System.out.print(counter);
                else
                    System.out.print(" S");
            } //
            System.out.println();
            counter++;

         }*/
    }
}

