class Solution {
    public int countPrimes(int n) {
        // if (n<=2) return 0;
        // int count = 0;
        // for (int i = 2; i < n; i++) {
        //     int flag = 1;
        //     for (int j = 2; j < i; j++) {
        //         if (i % j == 0){
        //             flag = 0;
        //             break;
        //         }
        //     }
        //     if (flag == 1) count++;
        // }
        // return count;

        boolean[] arr = new boolean[n];
        for(int i = 2; i < n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i*i < n; i++) {
            if (arr[i]) {
                for (int j = i * i; j < n; j = j+i) {
                    arr[j] = false;
                }
            }
        }
        int c = 0;
        for(boolean i : arr){
            if (i) {
                c++;
            }
        }
        return c;
    }
}