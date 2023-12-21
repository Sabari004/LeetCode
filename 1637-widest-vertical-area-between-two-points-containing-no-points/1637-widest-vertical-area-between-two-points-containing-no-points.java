class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> q=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<points.length;i++){
           if(!set.contains(points[i][0])){ q.add(points[i][0]);
            set.add(points[i][0]);}
        }
        int max=0;
        Collections.sort(q);
        // int t=q.peek();
        int n=q.size();
        for(int i=0;i<n-1;i++){
            // System.out.print(t+" ");
            max=max<q.get(i+1)-q.get(i)?q.get(i+1)-q.get(i):max;
            // t=q.remove();
        }
        return max;
    }
}