public class quick {
    public static void main(String[] args) {
        int a[] = {8, 7, 6, 5, 4, 3, 2, 1};
        quick(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i);
        }
    }

    static void quick(int a[], int l, int h) {
        if (l < h) {
            int j = part(a, l, h);
            quick(a, l, j - 1);
            quick(a, j + 1, h);
        }
    }

    static int part(int a[], int l, int h) {
        int pivot = a[l];
        int i = l, j = h;

        while (i < j) {
            while (i <= h && a[i] <= pivot) i++;
            while (a[j] > pivot) j--;

            if (i < j) {
                swap(a, i, j);
            }
        }

        swap(a, l, j);
        return j;
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
