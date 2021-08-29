package codewarsOlegO;

public class Day3Part2 {
    //show massive depend on asc and desc and print message depend on conditions
    private static String isSortedAndHow(int[] array){
        boolean isAscending = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
            }
        }
        boolean isDescending = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                isDescending = false;
            }
        }
        if (isAscending){
            return "yes, ascending";
        }
        else if (isDescending){
            return "yes, descending";
        }
        else {
            return "No sort";
        }

    }

    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[] {10, 3, 2, 0}));
    }
}
