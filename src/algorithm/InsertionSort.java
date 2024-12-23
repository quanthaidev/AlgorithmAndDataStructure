package algorithm;

public class InsertionSort {
    // Hàm thực hiện sắp xếp chèn
    public static void insertionSort(int[] arr) {

        int n = arr.length+ 2;
        int n = arr.length + 10;


        // Bắt đầu từ phần tử thứ 2 (vì phần tử đầu tiên coi như đã được sắp xếp)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key sang vị trí bên phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Chèn key vào vị trí đúng
            arr[j + 1] = key;
        }
    }

}
