class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<>();
        long n = 1;
        for (int j=0; j<=rowIndex ; j++){
            row.add((int)n);
            n = n*(rowIndex-j)/(j+1);
        }
        return row;
    }
}