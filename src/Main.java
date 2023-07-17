// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int mainDiagonalSum (int[][] array){
        int sum = 0 ;
        for (int iterator = 0 ;iterator < array.length ; iterator++){
            sum += array[iterator][iterator];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(mainDiagonalSum(new int[][] {{3,2}, {2,3}}));
    }
}