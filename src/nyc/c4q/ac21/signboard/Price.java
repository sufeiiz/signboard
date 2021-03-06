package nyc.c4q.ac21.signboard;

/**
 * Created by Yuliya on 3/28/15.
 * Price.java
 * Enters android figure and displays price
 */

public class Price {

    public static void printAndroid(SignBoard board) {
        int width = board.getWidth()/2 -7;
        int y = board.getHeight() / 2;

        for (int x = -13; x <= width; ++x) {
            SignBoard.Frame frame = board.newFrame();
            frame.setGreen();

            if (x < 0) {
                // Scrolling from the left side.
                frame.write(0, y - 3, "     \\ /     ".substring(-x));
                frame.write(0, y - 2, "     @@@@     ".substring(-x));
                frame.write(0, y - 1, "    @ @@ @    ".substring(-x));
                frame.write(0, y,     "@@ @@@@@@@@ @@".substring(-x));
                frame.write(0, y + 1, "@@ @@@@@@@@ @@".substring(-x));
                frame.write(0, y + 2, "   @@@@@@@@   ".substring(-x));
                frame.write(0, y + 3, "     @@ @@    ".substring(-x));
            } else {
                // stopping in the middle
                frame.write(x, y - 3, "     \\ /     ");
                frame.write(x, y - 2, "     @@@@     ");
                frame.write(x, y - 1, "    @ @@ @    ");
                frame.write(x, y,     "@@ @@@@@@@@ @@");
                frame.write(x, y + 1, "@@ @@@@@@@@ @@");
                frame.write(x, y + 2, "   @@@@@@@@   ");
                frame.write(x, y + 3, "     @@ @@    ");

            }
            frame.finish(0.04);
        }
    }


    public static void printPrice(SignBoard board, int cycles) {
        int width = board.getWidth() / 2 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();
            frame.setGreen();

            //android not moving in the middle
            frame.write(width, y - 3, "     \\ /     ");
            frame.write(width, y - 2, "     @@@@     ");
            frame.write(width, y - 1, "    @ @@ @    ");
            frame.write(width, y,     "@@ @@@@@@@@ @@");
            frame.write(width, y + 1, "@@ @@@@@@@@ @@");
            frame.write(width, y + 2, "   @@@@@@@@   ");
            frame.write(width, y + 3, "     @@ @@    ");

            //words appear on board
            if (i % 3 == 0) {
                frame.setYellow();
                frame.write(width - 30, y - 3, "$$$$  $$  $  $    $   $");
                frame.write(width - 30, y - 2, "$  $  $ $ $  $     $*$ ");
                frame.write(width - 30, y - 1, "$$$$  $  $$  $$$$   $  ");
            } else if (i % 2 == 0) {
                frame.setWhite();
                frame.write(width - 30, y,     "$$$$  $$$$  $$$$   ");
                frame.write(width - 30, y + 1, "$~~   $  $  $~~`    ");
                frame.write(width - 30, y + 2, "$     $$$$  $  $  ");
            } else {
                frame.setRed();
                frame.write(width + 30, y - 1, "$$$$$$   $$$$$ $$$$$");
                frame.write(width + 30, y,     "   $$    $   $ $   $");
                frame.write(width + 30, y + 1, "  $$     $   $ $   $");
                frame.write(width + 30, y + 2, " $$   $  $$$$$ $$$$$");
            }
            frame.finish(0.6);


        }
    }

    public static void androidLeaving(SignBoard board) {
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        //android leaving the board
        for (int x = width/2-7; x <= width-14; ++x) {
            SignBoard.Frame frame = board.newFrame();
            frame.setGreen();

            frame.write(x, y - 3, "     \\ /     ");
            frame.write(x, y - 2, "     @@@@     ");
            frame.write(x, y - 1, "    @ @@ @    ");
            frame.write(x, y,     "@@ @@@@@@@@ @@");
            frame.write(x, y + 1, "@@ @@@@@@@@ @@");
            frame.write(x, y + 2, "   @@@@@@@@   ");
            frame.write(x, y + 3, "     @@ @@    ");
            frame.finish(0.05);

        }
    }
}
