class Solution {
    public String getHint(String secret, String guess) {
        int b = 0, c = 0;
        int[] res = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            int s1 = secret.charAt(i) - '0';
            int g1 = guess.charAt(i) - '0';

            if (s1 == g1) {
                b++;
            } else {
                if (res[s1] < 0) c++;
                if (res[g1] > 0) c++;
                res[s1]++;
                res[g1]--;
            }
        }

        return b + "A" + c + "B";
    }
}