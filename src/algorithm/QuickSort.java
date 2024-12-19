public class QuickSort {
    // Hàm chính thực hiện Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Tìm chỉ số của phần tử được chọn làm pivot sau khi chia mảng
            int pi = partition(arr, low, high);

            // Đệ quy sắp xếp các phần tử trước và sau pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Hàm phân mảng (partition) và chọn pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Chọn phần tử cuối làm pivot
        int i = (low - 1); // Chỉ số của phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            // Nếu phần tử hiện tại nhỏ hơn hoặc bằng pivot
            if (arr[j] <= pivot) {
                i++;

                // Hoán đổi arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Hoán đổi arr[i+1] và pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Trả về chỉ số của pivot
    }
}
