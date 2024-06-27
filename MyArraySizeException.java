class MyArraySizeException extends Exception {
    int size;

    MyArraySizeException(int s) {
        size = s;
    }

    public String toString() {
        return "Выходит за пределы массива";
    }
}
