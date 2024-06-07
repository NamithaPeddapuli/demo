PSEUSO CODE

MergeSort(array, lo, high):
    if lo < high:
        mid = (lo + high) // 2
        mergeSort(array, lo, mid)
        mergeSort(array, mid + 1, high)
        merge(array, lo, mid, high)

merge(array, lo, mid, high):
    temp = []
    i, j = lo, mid + 1 //These are pointers in both subarrays
    while i <= mid and j <= high:
        append smaller of array[i] or array[j] to temp array
    add remaining elements of either 1st subarray or 2nd subarray to temp
    copy temp array to original array



PROGRAM FOR MERGE SORT

public class Main {

    public static void mergeSort(int[] array, int lo, int high) {
        if (lo < high) {
            int mid = (lo + high) / 2;
            mergeSort(array, lo, mid);
            mergeSort(array, mid + 1, high);
            merge(array, lo, mid, high);
        }
    }
    public static void merge(int[] array, int lo, int mid, int high) {
        int[] temp = new int[high - lo + 1];
        int i = lo, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        for (i = lo, k = 0; i <= high; i++, k++) {
            array[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] array = {54,31,1,90};

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array for the given array is");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
