package algorithm;

public class MergeSort {
    // Hàm thực hiện Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Tìm chỉ số giữa mảng để chia làm hai nửa
            int mid = (left + right) / 2;

            // Đệ quy chia nửa trái
            mergeSort(arr, left, mid);

            // Đệ quy chia nửa phải
            mergeSort(arr, mid + 1, right);

            // Hợp nhất hai nửa lại với nhau
            merge(arr, left, mid, right);
        }
    }

    // Hàm hợp nhất hai nửa đã sắp xếp
    public static void merge(int[] arr, int left, int mid, int right) {
        // Tính toán kích thước của hai nửa
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo mảng tạm thời cho hai nửa
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Sao chép dữ liệu vào mảng tạm thời
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Hợp nhất các mảng tạm thời trở lại vào mảng chính
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] (nếu có)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] (nếu có)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
