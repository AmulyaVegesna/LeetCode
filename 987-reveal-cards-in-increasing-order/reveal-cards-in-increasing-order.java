class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)q.offer(i);
        int res[] = new int[n];
        Arrays.sort(deck);
        for(int i=0;i<n;i++){
            int j = q.poll();
            res[j]=deck[i];
            if(!q.isEmpty())q.offer(q.poll());
        }
        return res;
    }
}