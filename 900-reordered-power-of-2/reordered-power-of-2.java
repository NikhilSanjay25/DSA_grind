class Solution {
    static boolean ret;
    public boolean reorderedPowerOf2(int n) {
        if (n <= 0) return false;

        int nd = digits(n);
        long number = 1;
        while (digits(number) != nd) {
            number = number * 2;
        }

        int[] num = new int[10];
        long temp = n; 
        while (temp != 0) {
            num[(int)(temp % 10)]++;
            temp = temp / 10;
        }

        int[] arr = new int[10];
        while (digits(number) == nd) {
            Arrays.fill(arr, 0);
            temp = number;
            while (temp != 0) {
                arr[(int)(temp % 10)]++;
                temp = temp / 10;
            }
            comp(arr, num);
            if (ret) {
                return true;
            }
            number = number * 2;
        }
        return false;
    }

    public static void comp(int[] arr, int[] arr2) {
        ret = true;
        for (int i = 0; i < 10; i++) {
            if (arr[i] != arr2[i]) {
                ret = false;
                return;
            }
        }
    }
    public static int digits(long n) { 
        if (n == 0) return 1;
        int ndigits = 0;
        while (n != 0) {
            ndigits++;
            n = n / 10;
        }
        return ndigits;
    }
}
