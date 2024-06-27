public class Main {
    public static void main(String[] args) {
        String[][] table = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        int i, j;
        int count = 0;


        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                try {
                    int[][] num = new int[table.length][table.length];
                    num[i][j] = Integer.parseInt(table[i][j]);
                    count = count + Integer.parseInt(table[i][j]);
                    throw new MyArrayDataException(i,j);
                    throw new MyArraySizeException(table.length);
                } catch (MyArrayDataException exc) {
                    System.out.println(exc);
                } catch (MyArraySizeException exc) {
                    System.out.println(exc);
                }
            }
        }
        System.out.println(count);
    }
}