class MyArrayDataException extends Exception {
    int n;
    int d;
    int[][] arr = new int [n][d];

    MyArrayDataException (int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Значение ячейки " + n + "." + d + " не целочисленное";
    }
}