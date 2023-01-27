package lection1.ticTacToe;

import java.util.Scanner;

public class TikTacToe {

    public static void main(String[] args) {

        char[][] feld = new char[3][3];

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                feld[i][j] = ' ';
            }
        }

        Scanner scanner = new Scanner(System.in);
        gameStart(feld, scanner);
    }

    private static void gameStart(char[][] feld, Scanner scanner) {
        int playerNumber;
        char symbol;
        for (int i = 1; i < 9; i++) {
            if (i % 2 == 1) {
                playerNumber = 1;
                symbol = 'X';
            } else playerNumber = 2;
            symbol = '0';

            //
            // Если игрок выиграл  resGame = 1
            // Если игрок сделал ход  resGame = 2
            //
            //
            int resGame = playerMakeMove(feld, playerNumber, symbol, scanner);
            if (resGame == 1) {
                System.out.println("Победа игрока" + playerNumber);
            }
        }
    }

    /**
     * Игрок осуществляет ход
     *
     * @param feld
     * @param playerNumber
     * @param symbol
     * @param scanner
     */
    private static int playerMakeMove(char[][] feld, int playerNumber, char symbol, Scanner scanner) {
        int res;
        while (true) {
            drawFeld(feld);
            System.out.println("Ход игрока номер :" + playerNumber);
            System.out.println("Введи 100 если хочешь сдаться");
            System.out.println("Введи для очередного хода номер столбца 0 - 2");
            int input = scanner.nextInt();
            if (input == 100) {
                return 3;
            }
            int x = input;
            //
            //   | X|  |  |    x,y
            //   |  |  |  |
            //   |  |  |  |
            //
            //
            //
            System.out.println("Введи для очередного хода номер строки");

            int y = scanner.nextInt();
            if (checkResultMove(x, y, feld, symbol) == 0) {
                System.out.println("Поле занято. Переходи");
                continue;
            } else if (checkResultMove(x, y, feld, symbol) == 1) {
                res = 1;
                break;
            } else {
                feld[x][y] = symbol;
                res = 2;
                break;
            }
        }
        return res;
    }

    /**
     * @param x
     * @param y
     * @param feld
     * @param symbol
     * @return
     */
    private static int checkResultMove(int x, int y, char[][] feld, char symbol) {

        if (feld[x][y] != ' ') {
            return 0;
        } else if (y == 2 && x == 0) {
            if (feld[1][0] == symbol && feld[0][0] == symbol ||
                    feld[2][1] == symbol && feld[2][2] == symbol ||
                    feld[1][1] == symbol && feld[0][2] == symbol)
                return 1;
        }

        //
        //   | X|   | X|    x,y
        //   | X| X |  |
        //   | X| X |X |
        //
        return 1;
    }

    private static void drawFeld(char[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            System.out.println();
            for (int j = 0; j < feld[i].length; j++) {
                System.out.println(feld[i][j] + " ");
            }
        }
    }


}
