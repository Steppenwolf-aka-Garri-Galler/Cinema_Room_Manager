import java.util.Scanner;
public class cinemaRoomManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row: ");
        int seats = scanner.nextInt();
        int counter = 1; //because we don't need 0 here

        System.out.println("Cinema:");
        System.out.print(" ");
        for( int m = 1; m <= seats; m++) {
            System.out.print(" " + m);
        }
        System.out.println();   //here we printed first column of numbers 0f the cinema


        String[][] matrix = new String[rows][seats+1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if (j == 0) {
                    System.out.print(counter);
                } else {
                    matrix[i][j] = " S";
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
            counter++;  //and here we printed everything according to rows and columns of the user's option

        }
        System.out.println();
        System.out.println("Enter a row number:");
        int userInput = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int userInput1 = scanner.nextInt();

        
        if (rows * seats < 60) {
            System.out.println("Ticket price: $" + 10);
        } else {
            if(rows % 2 == 0) {
                if (userInput < rows / 2)
                    System.out.println("Ticket price: $" + 10);
                else
                    System.out.println("Ticket price: $" + 8);

            } else {
                if (userInput <= (rows - 1) / 2)
                    System.out.println("Ticket price: $" + 10);
                else
                    System.out.println("Ticket price: $" + 8);
            }
        } //here we calculated the price of a ticket according to coordinates of the seat

        System.out.println("Cinema:");
        System.out.print(" ");
        for( int m = 1; m <= seats; m++) {
            System.out.print(" " + m);
        }
        System.out.println();

        int counter1 = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if (j == 0) {
                    System.out.print(counter1);
                } else {
                    if (userInput - 1 == i && userInput1 == j) {
                        matrix[i][j] = " B";
                        System.out.print(matrix[i][j]);
                    } else {
                        matrix[i][j] = " S";
                        System.out.print(matrix[i][j]);
                    }
                }
            }
            System.out.println();
            counter1++;
        } //and finally we replaced the taken place by "B" sign and printed cinema structure one more time
    }
}

