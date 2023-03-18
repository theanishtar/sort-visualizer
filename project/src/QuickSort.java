
import java.util.Arrays;

// Java program for implementation of QuickSort
class QuickSort {

    static void quickSort(int[] a, int L, int R) {
        if (L >= R) {
            return;
        }
        //B1. Chon khoa
        int key = a[(L + R) / 2];
        //B2. Phan bo lai mang theo khoa
        int k = partition(a, L, R, key);
        //System.out.println("L = " + L + " R = " + R + " pivot = " + key + " k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        //System.out.println("-----------------");
        //B3. Chia doi mang => Lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }
    // 62 26 11 14 35 81 78 30

    static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            while (a[iL] < key) {
                iL++;
            }
            while (a[iR] > key) {
                iR--;
            }
            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                //System.out.println("Swap(" + iL + "-" + iR + ")");
                //System.out.println("^"+Arrays.toString(a));
                iL++;
                iR--;
            }
        }
        return iL;
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {6,7,8,5,4,1,2,3};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        System.out.println("Start");

        quickSort(arr, 0, n - 1);

        System.out.println("sorted array");

        System.out.println(Arrays.toString(arr));
    }
}
/*This code is contributed by Rajat Mishra */
