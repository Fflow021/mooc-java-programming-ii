
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm
        // here
        int xI = 0;
        int yI = size / 2;
        int value = 1;

        while (value <= size * size) {
            square.placeValue(xI, yI, value++);

            int newXI = xI - 1;
            int newYI=  yI + 1;

            if (newXI < 0) {
                newXI = size + newXI;
            }

            if (newYI >= size) {
                newYI = size - newYI;
            }

            if (square.readValue(newXI, newYI) != 0) {
                newXI = (xI + 1) % size;
                newYI = yI;
            }

            xI = newXI;
            yI = newYI;
        }

        return square;
    }

}