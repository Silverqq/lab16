import java.util.Arrays;
import java.util.Scanner;
public class ArraySorter {
    public static void sort(int[] arr, SortType sortType) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (sortType.compare(arr[j], arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public interface SortType {
        boolean compare(int a, int b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Длина вашего массива: ");
        int lengthMass = in.nextInt();
        int[] sortArr = new int[lengthMass];
        for (int i = 0; i < lengthMass; i++) {
            System.out.printf("Число номер %d: ", i);
            sortArr[i] = in.nextInt();
        }
        ArraySorter.sort(sortArr, (a, b) -> a < b);
        System.out.println("В порядке Убывания: " + Arrays.toString(sortArr));
        ArraySorter.sort(sortArr, (a, b) -> a > b);
        System.out.println("В порядке Возрастания: " + Arrays.toString(sortArr));
    }
}
