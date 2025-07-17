class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int res = 0;
            while (num > 0) {
                int d = num % 10;
                res+=d;
                num /= 10;
            }
            num = res;
        }    
        return num;
    }
}


// n = str(num)
//         s = 0
//         if num <= 0:
//             return num
//         while len(n) > 1:
//             p = []
//             for i in n:
//                 p.append(int(i))
//             p = sum(p)
//             n = str(p)
//         return int(n)