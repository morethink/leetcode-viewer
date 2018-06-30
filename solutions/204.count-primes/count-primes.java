class Solution {
public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        //false代表素数，true代表非素数
        boolean[] flags = new boolean[n];
//        for (boolean flag : flags) {
//            System.out.print(flag + " ");
//        }
        //0不是素数
        flags[0] = true;
        //1不是素数
        flags[1] = true;
        int num = n - 2;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            //当i为素数时，i的所有倍数都不是素数
            if (!flags[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    if (!flags[j]) {
                        flags[j] = true;
                        num--;
                    }
                }

            }
        }
//        System.out.println();
//        for (boolean flag : flags) {
//            System.out.print(flag + " ");
//        }
//        System.out.println();
        return num;
    }
}