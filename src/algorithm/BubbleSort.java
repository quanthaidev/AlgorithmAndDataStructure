package algorithm;

public class BubbleSort {
    // Hàm thực hiện sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
        int a = 4;
        int n = arr.length;
        boolean swapped;

        // Lặp qua tất cả các phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Lặp qua các phần tử từ 0 đến n - i - 1
            for (int j = 0; j < n - i - 1; j++) {
                // Nếu phần tử hiện tại lớn hơn phần tử tiếp theo, hoán đổi chúng
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi arr[j] và arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Nếu không có hoán đổi nào được thực hiện trong lần lặp, dừng
            if (!swapped) {
                break;
            }
        }
    }

}
