public class SortedSquareArray {

    public int[] sortedSquaredArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        int[] newArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (Math.abs(arr[last]) > Math.abs(arr[first])) {
                newArr[i] = arr[last] * arr[last];
                last--;
            } else {
                newArr[i] = arr[first] * arr[first];
                first++;
            }
        }
        return newArr;
    }

}
