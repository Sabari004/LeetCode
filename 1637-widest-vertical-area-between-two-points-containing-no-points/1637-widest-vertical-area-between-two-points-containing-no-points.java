class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // ArrayList<Integer> q=new ArrayList<>();
        int n=points.length;
        int q[]=new int[n];
        // HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            q[i]=points[i][0];
        }
        int max=0;
        Arrays.sort(q);
        // int t=q.peek();
        
        for(int i=0;i<n-1;i++){
            // System.out.print(t+" ");
            max=max<q[i+1]-q[i]?q[i+1]-q[i]:max;
            // t=q.remove();
        }
        return max;
    }
}