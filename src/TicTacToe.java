import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe");
        System.out.println("In this game there will be 2 players, Player 1 and Player 2 ");
        System.out.println("Player 1 will be X and Player 2 will be O ");
        System.out.println("In my game, the board is labelled from numbers 1 to 9 which corresponds to the position it is on the board as shown on the board ");
        System.out.println("In order to place your character on the board, you must choose a number from 1-9");
        System.out.println("The goal of TicTacToe is to get 3 in a row either vertically, horizontally or diagonally");
        System.out.println("If all the spots on the board are filled, the game ends in a draw ");
        System.out.println("I hope you enjoy and make sure to have fun!");

        

        char[][] board = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };


        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

        int player = 1;

        while (true) {
            System.out.println("Player" + player + ", " + "where do you want to make your move? ");
            int choice = keyboard.nextInt();

            int row = (choice - 1) / 3;
            int column = (choice - 1) % 3;

            if (board[row][column] == 'X' || board[row][column] == 'O') {
                System.out.println("This spot is taken. Please enter a new one ");
                continue;

            }

            char symbol;

            if (player == 1) {
                symbol = 'X';
                board[row][column] = 'X';
            } else {
                symbol = 'O';
                board[row][column] = 'O';

            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + "|");

                }
                System.out.println();

            }

            if (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;
            } else if (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;

            } else if (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;

            } else if (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;
            } else if (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;

            } else if (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;

            } else if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;

            } else if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
                System.out.println("Player " + player + " has won ");
                break;

            }

            Boolean fullBoard = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != 'X' && board[i][j] != 'O') {
                        fullBoard = false;
                        break;

                    }

                }

            }

            if (fullBoard == true) {
                System.out.println("This game has ended in a draw ");
                break;

            }

            if (player == 1) {
                player = 2;
            } else
                player = 1;
            {

            }
        }

        keyboard.close();
    }
}
